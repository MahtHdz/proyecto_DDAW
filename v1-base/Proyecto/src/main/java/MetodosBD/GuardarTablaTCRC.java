package MetodosBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maht_
 */
public class GuardarTablaTCRC {
    public GuardarTablaTCRC(int idTarjeta, String responsabilidad, String colaborador){
        DB DBOps = new DB();
        DBOps.openConn();
        Statement SQLQueryOp = DBOps.getSQLQueryOp();
        String SQL = "INSERT INTO tabla_crc ('responsabilidad', 'colaborador', 'id_tarjeta') "
                + "VALUES ('"+ responsabilidad +"', '"+ colaborador +"', '"+ idTarjeta +"')";
        ResultSet query = DBOps.getSQLQuery(SQLQueryOp, SQL);   
        try{
            SQLQueryOp.execute(SQL);
            DBOps.closeConn();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }   
    }
}
