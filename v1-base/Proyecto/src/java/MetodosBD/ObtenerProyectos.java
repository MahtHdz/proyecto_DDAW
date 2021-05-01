
package MetodosBD;

import Pojos.Proyecto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ObtenerProyectos {
     private List<Proyecto> listaProductos = new ArrayList();

    public ObtenerProyectos(String emailUsuario){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
            Statement SentenciaSQL = Conexion.createStatement();
            ResultSet Proyectos = SentenciaSQL.executeQuery("SELECT * FROM proyecto WHERE emailUsuario = '"+emailUsuario+"'");

            while (Proyectos.next()) {
                String nombreBD = Proyectos.getString("nombre");
                String descripcionBD = Proyectos.getString("descripcion");
                String emailUsuarioBD = Proyectos.getString("emailUsuario");

                Proyecto proyecto = new Proyecto(nombreBD, descripcionBD, emailUsuarioBD);
                listaProductos.add(proyecto);
            }
            Proyectos.close();
            Conexion.close();
            SentenciaSQL.close();
      }
      catch (ClassNotFoundException e) {
        System.out.println("Clase no encontrada");
      }
      catch (SQLException e) {
        System.out.println(e);
      }    
    }
    
    public List<Proyecto> obtenerListaProyectos() {
        return listaProductos;
    }
}
