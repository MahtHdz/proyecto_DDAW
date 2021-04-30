
package MetodosBD;

import Pojos.Proyecto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ObtenerProyectos {
    private List<Proyecto> listaProductos = new ArrayList();

    public ObtenerProyectos(String emailUsuario){
        DB DBOps = new DB();
        DBOps.openConn();
        Statement SQLQueryOp = DBOps.getSQLQueryOp();
        String SQL = "SELECT * FROM proyecto WHERE emailUsuario = '"+emailUsuario+"'";
        ResultSet result = DBOps.getSQLQuery(SQLQueryOp, SQL);  
        try{
            while (result.next()) {
                int idBD = result.getInt("id");
                String nombreBD = result.getString("nombre");
                String descripcionBD = result.getString("descripcion");
                String emailUsuarioBD = result.getString("emailUsuario");
                Proyecto proyecto = new Proyecto(idBD, nombreBD, descripcionBD, emailUsuarioBD);
                listaProductos.add(proyecto);
            }
            result.close();
            DBOps.closeConn();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public List<Proyecto> obtenerListaProyectos() {
        return listaProductos;
    }
}
