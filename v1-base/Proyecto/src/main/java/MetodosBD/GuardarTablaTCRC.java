package MetodosBD;

import Pojos.Proyecto;
import Pojos.TablaTCRC;
import java.sql.Connection;
import java.sql.DriverManager;
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
//        DB DBOps = new DB();
//        DBOps.openConn();
//        Statement SQLQueryOp = DBOps.getSQLQueryOp();
//        String SQL = "INSERT INTO tabla_crc ('responsabilidad', 'colaborador', 'id_tarjeta') "
//                + "VALUES ('"+ responsabilidad +"', '"+ colaborador +"', '"+ idTarjeta +"')";
//        ResultSet query = DBOps.getSQLQuery(SQLQueryOp, SQL);   
//        try{
//            SQLQueryOp.execute(SQL);
//            DBOps.closeConn();
//        }catch(SQLException e){
//            System.out.println(e.getMessage());
//        }   
//    }
    
        try{ 
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
            Statement SentenciaSQL = Conexion.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String SQL = "SELECT * FROM tabla_crc";
            ResultSet query = SentenciaSQL.executeQuery(SQL);

            query.moveToInsertRow();
            query.updateString("responsabilidad", responsabilidad);
            query.updateString("colaborador", colaborador);
            query.updateInt("id_tarjeta", idTarjeta);
            query.insertRow();
            System.out.println("Inserción de la Tabla de Colaboradores exitosa");

            query.close();
            Conexion.close();
            SentenciaSQL.close();
            }
            catch (ClassNotFoundException e) {
              System.out.println("Clase no encontrada");
            }
            catch (SQLException e) {
              System.out.println(e);
            } 
    }
}
