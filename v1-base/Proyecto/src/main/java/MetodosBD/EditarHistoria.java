/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosBD;

import Pojos.HistoriaDeUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maht_
 */
public class EditarHistoria {
    
    private HistoriaDeUsuario historia;
    
    public EditarHistoria(){}
    
    public void getStory(int id_story){
        DB DBOps = new DB();
        DBOps.openConn();
        Statement SQLQueryOp = DBOps.getSQLQueryOp();
        String SQL = "SELECT * FROM historia_usuario WHERE id = '"+id_story+"'";
        ResultSet query = DBOps.getSQLQuery(SQLQueryOp, SQL);
        try{
            while (query.next()) {
                int id = query.getInt("id");
                String nombre = query.getString("nombre");
                int numero = query.getInt("numero");
                String fecha = query.getString("fecha");
                int valor = query.getInt("valor");
                int tiempo_d = query.getInt("tiempo_d");
                String descripcion = query.getString("descripcion");
                String observaciones = query.getString("observaciones");
                historia = new HistoriaDeUsuario(id, nombre, numero, fecha, valor, tiempo_d, descripcion, observaciones);
            }
            query.close();
            DBOps.closeConn();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        } 
    }
    
    public void editStory(String nombre, int numero, String fecha, int valor, int tiempo_d, String descripcion, String observaciones){
    
            DB DBOps = new DB();
            DBOps.openConn();
            Statement SQLQueryOp = DBOps.getSQLQueryOp();
            String SQL = "UPDATE historia_usuario SET nombre='"+ nombre +"', numero='"+ numero +"', "
                    + "fecha='"+ fecha +"'', valor='"+ valor +"', tiempo_d='"+ tiempo_d +"', "
                    + "descripcion='"+ descripcion +"', observaciones='"+ observaciones +"' WHERE id='"+ historia.getId() +"'";
            try{
                SQLQueryOp.execute(SQL);
                DBOps.closeConn();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }  
        
    }

    public HistoriaDeUsuario getHistoria() {
        return historia;
    }
    
}
