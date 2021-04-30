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
                System.out.println("Entramos abuscar tarjaetas para: "+emailUsuario+"");
                System.out.println("En el proyecto: "+idProyecto+"");
            
            DB DBOps = new DB();
            DBOps.openConn();
            Statement SQLQueryOp = DBOps.getSQLQueryOp();
            String SQL = "SELECT * FROM tarjeta_crc WHERE emailUsuario = '"+emailUsuario+"' AND id_proyecto = '" + idProyecto + "'";
            ResultSet query = DBOps.getSQLQuery(SQLQueryOp, SQL);            
            try{
                while (query.next()) {
                    int idTarjeta = query.getInt("id");
<<<<<<< HEAD
                System.out.println("Busqueda: "+idTarjeta+"");
                    String clase = query.getString("clase");
                    String lista_super = query.getString("lista_super");
                    String lista_sub = query.getString("lista_sub");
=======
                    String clase = query.getString("clase");
                    String lista_super = query.getString("descripcion");
                    String lista_sub = query.getString("emailUsuario");
                    SQL = "SELECT * FROM tabla_crc WHERE id_tarjeta = '" + idTarjeta + "'";
                    ResultSet tablaTCRC = DBOps.getSQLQuery(SQLQueryOp, SQL);
                    int size = 0;
                    if(tablaTCRC != null){
                        ResultSet tmp = tablaTCRC;
                        tmp.last();
                        size = tmp.getRow();
                    }
                    TablaTCRC tabla[] = new TablaTCRC[size];
                    for(int i = 0; i < size; i++)
                        tabla[i] = new TablaTCRC();
>>>>>>> f7f33087a56880405ac0cbf5cce70f54bb26c175
                    
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
