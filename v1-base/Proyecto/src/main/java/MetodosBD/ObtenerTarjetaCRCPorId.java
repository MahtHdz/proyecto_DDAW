
package MetodosBD;

import Pojos.TarjetaCRC;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ObtenerTarjetaCRCPorId {
     private TarjetaCRC tarjeta;

    public ObtenerTarjetaCRCPorId(int idProyecto){
        DB DBOps = new DB();
            DBOps.openConn();
            Statement SQLQueryOp = DBOps.getSQLQueryOp();
            String SQL = "SELECT * FROM tarjeta_crc WHERE id = '"+idProyecto+"'";
            ResultSet query = DBOps.getSQLQuery(SQLQueryOp, SQL);            
            try{
                while (query.next()) {
                    int idTarjeta = query.getInt("id");
                    String clase = query.getString("clase");
                    String lista_super = query.getString("lista_super");
                    String lista_sub = query.getString("lista_sub");
                    ObtenerTablaTCRC tabla = new ObtenerTablaTCRC(idTarjeta); //obtenemos los colaboradores con su responsabilidad
                    
                    tarjeta = new TarjetaCRC(idTarjeta, clase, lista_super, lista_sub, tabla.obtenerListaTablaTCRC());
                }
                query.close();
                DBOps.closeConn();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }   
    }
    
    public TarjetaCRC obtenerTarjeta() {
        return tarjeta;
    }
}
