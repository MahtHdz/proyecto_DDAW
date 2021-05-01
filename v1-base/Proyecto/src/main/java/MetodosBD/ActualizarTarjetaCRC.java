
package MetodosBD;

import Pojos.Proyecto;
import Pojos.TablaTCRC;
import Pojos.TarjetaCRC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ActualizarTarjetaCRC {
    
    public ActualizarTarjetaCRC(TarjetaCRC tarjeta) {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
            Statement SentenciaSQL = Conexion.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet Tarjeta = SentenciaSQL.executeQuery("SELECT * FROM tarjeta_crc WHERE id ='"+tarjeta.getID()+"'");
            
            Tarjeta.first();
//            String clase  = Tarjeta.getString("clase");
//            String superClases  = Tarjeta.getString("lista_super");
//            String subClases  = Tarjeta.getString("lista_sub");
//            int idProyecto  = Tarjeta.getInt("id_proyecto");
//            String emailUsuario  = Tarjeta.getString("emailUsuario");
            
            Tarjeta.updateString("clase", tarjeta.getClase());
            Tarjeta.updateString("lista_super", tarjeta.getListaSuper());
            Tarjeta.updateString("lista_sub", tarjeta.getListaSub());
            Tarjeta.updateInt("id_proyecto", Proyecto.idProyectoActual);
            Tarjeta.updateString("emailUsuario", ObtenerUsuario.usuarioLogeado.getEmail());
            
            Tarjeta.updateRow();
            Tarjeta.close();
            Conexion.close();            
            SentenciaSQL.close();
            System.out.println("Actualización de tarjeta exitosa");
            
//            for(TablaTCRC tabla : tarjeta.getTablaTarjetaCRC()){
                System.out.println("Actualizando la tarjeta con id: " +TarjetaCRC.idTarjetaActual);
                ActualizarTablaTCRC actualizarTabla = new ActualizarTablaTCRC(tarjeta);
//            }
            
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
        } catch (SQLException e) {
        System.out.println(e);
        }
    }
}
