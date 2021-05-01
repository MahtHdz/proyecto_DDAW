
package MetodosBD;

import Pojos.TablaTCRC;
import Pojos.TarjetaCRC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ActualizarTablaTCRC {
    
    public ActualizarTablaTCRC(TarjetaCRC tarjeta){
        try{ 
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
            Statement SentenciaSQL = Conexion.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String SQL = "SELECT * FROM tabla_crc WHERE id_tarjeta ='"+TarjetaCRC.idTarjetaActual+"'";
            ResultSet TablaTCRCResultSet = SentenciaSQL.executeQuery(SQL);
            
            TablaTCRCResultSet.first();
//            while(TablaTCRCResultSet.next()){
                for(TablaTCRC tabla : tarjeta.getTablaTarjetaCRC()){
//                    if(TablaTCRCResultSet!=null){
                        TablaTCRCResultSet.updateString("responsabilidad", tabla.getResponsabilidad());
                        TablaTCRCResultSet.updateString("colaborador", tabla.getResponsabilidad());
                        TablaTCRCResultSet.updateRow();
                        TablaTCRCResultSet.next();
                }
//            }
                
//            }
            
            
            TablaTCRCResultSet.close();

            Conexion.close();            
            SentenciaSQL.close();
            System.out.println("Actualización exitosa");
            }
            catch (ClassNotFoundException e) {
              System.out.println("Clase no encontrada");
            }
            catch (SQLException e) {
              System.out.println(e);
            } 
    }
}
