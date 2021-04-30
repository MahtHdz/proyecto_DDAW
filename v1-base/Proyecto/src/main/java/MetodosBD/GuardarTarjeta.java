/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosBD;

import Pojos.TablaTCRC;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maht_
 */
public class GuardarTarjeta {
    
    public GuardarTarjeta(){}
    
    public void sendCard(String clase, String listaSuper, String listaSub, TablaTCRC tabla[]){
            int id = 0;
            DB DBOps = new DB();
            DBOps.openConn();
            Statement SQLQueryOp = DBOps.getSQLQueryOp();
            String SQL_discoveringID = "SELECT id FROM historia_usuario";
            String SQL = "INSERT INTO tarjeta ('clase', 'lista_super', 'lista_sub')"
                    + " VALUES ('"+ clase +"', '"+ listaSuper +"', '"+ listaSub +"'";
            ResultSet query = DBOps.getSQLQuery(SQLQueryOp, SQL_discoveringID);
            try{
                if(query != null){
                    query.last();
                    id = query.getInt("id");
                    id += 1;
                }
                SQLQueryOp.execute(SQL);
                for(int i = 0; i < tabla.length; i++)
                    new GuardarTablaTCRC(id, tabla[i].getResponsabilidad(), tabla[i].getColaborador());
                
                DBOps.closeConn();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }   
    }
}
