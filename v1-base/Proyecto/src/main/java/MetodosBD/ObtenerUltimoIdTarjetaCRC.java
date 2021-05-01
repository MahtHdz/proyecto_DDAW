package MetodosBD;

import Pojos.TarjetaCRC;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ObtenerUltimoIdTarjetaCRC {
    private int idTarjetaAInsertar;

    public ObtenerUltimoIdTarjetaCRC(){
        DB DBOps = new DB();
        DBOps.openConn();
        Statement SQLQueryOp = DBOps.getSQLQueryOp();
        String SQL = "SELECT id FROM tarjeta_crc";
        ResultSet query = DBOps.getSQLQuery(SQLQueryOp, SQL);            
        try{
            while(query.next()){
                idTarjetaAInsertar = query.getInt("id");
                System.out.println("Ultimo id: "+idTarjetaAInsertar);
            }
            
            query.close();
            DBOps.closeConn();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }   
    }

    public int getUltimoId() {
        return idTarjetaAInsertar;
    }
}
