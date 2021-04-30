/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosBD;

import Pojos.TablaTCRC;
import Pojos.TarjetaCRC;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maht_
 */
public class ObtenerTarjetas {
        private List<TarjetaCRC> listaTarjetas = new ArrayList();
        
        public ObtenerTarjetas(){}
        
        public ObtenerTarjetas(String emailUsuario, int idProyecto){            
            DB DBOps = new DB();
            DBOps.openConn();
            Statement SQLQueryOp = DBOps.getSQLQueryOp();
            String SQL = "SELECT * FROM tarjeta_crc WHERE emailUsuario = '"+emailUsuario+"' AND id_proyecto = '" + idProyecto + "'";
            ResultSet query = DBOps.getSQLQuery(SQLQueryOp, SQL);            
            try{
                while (query.next()) {
                    int idTarjeta = query.getInt("id");
                    String clase = query.getString("clase");
                    String lista_super = query.getString("lista_super");
                    String lista_sub = query.getString("lista_sub");
                    ObtenerTablaTCRC tabla = new ObtenerTablaTCRC(idTarjeta);
                    
                    TarjetaCRC tarjeta = new TarjetaCRC(idTarjeta, clase, lista_super, lista_sub, tabla.obtenerListaTablaTCRC());
                    listaTarjetas.add(tarjeta);
                }
                query.close();
                DBOps.closeConn();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }   
        }

    public List<TarjetaCRC> getListaTarjetas() {
        return listaTarjetas;
    }
    
}
