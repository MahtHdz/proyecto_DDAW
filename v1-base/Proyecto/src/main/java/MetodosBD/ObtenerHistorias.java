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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maht_
 */
public class ObtenerHistorias {
    private List<HistoriaDeUsuario> listaHistorias = new ArrayList();
    
    public ObtenerHistorias(){}
    
    public void getStories(String emailUsuario, int idProyecto){           
            DB DBOps = new DB();
            DBOps.openConn();
            Statement SQLQueryOp = DBOps.getSQLQueryOp();
            String SQL = "SELECT * FROM historia_usuario WHERE emailUsuario = '"+emailUsuario+"' AND id_proyecto = '" + idProyecto + "'";
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
                    HistoriaDeUsuario historia = new HistoriaDeUsuario(id, nombre, numero, fecha, valor, tiempo_d, descripcion, observaciones);
                    listaHistorias.add(historia);
                }
                query.close();
                DBOps.closeConn();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }   
    }

    public List<HistoriaDeUsuario> getListaHistorias() {
        return listaHistorias;
    }
}
