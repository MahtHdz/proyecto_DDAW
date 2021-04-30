/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosBD;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maht_
 */
public class GuardarHistoria {
    
    public GuardarHistoria(){}
    
    public void sendStory(String nombre, int numero, String fecha, int valor, int tiempo_d, String descripcion, String observaciones){
            DB DBOps = new DB();
            DBOps.openConn();
            Statement SQLQueryOp = DBOps.getSQLQueryOp();
            String SQL = "INSERT INTO historia_usuario ('nombre', 'numero', 'fecha', 'valor', 'tiempo_d', 'descripcion', 'observaciones')"
                    + " VALUES ('"+ nombre +"', '"+ numero +"', '"+ fecha +"', '"+ valor +"', '"+ tiempo_d +"', '"+ descripcion +"', '"+ observaciones +"')";
            try{
                SQLQueryOp.execute(SQL);
                DBOps.closeConn();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }   
        
    }
    
    
}
