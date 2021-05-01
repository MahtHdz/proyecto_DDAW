/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosBD;

import Pojos.Proyecto;
import Pojos.TablaTCRC;
import Pojos.TarjetaCRC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maht_
 */
public class GuardarTarjeta {
    
    public GuardarTarjeta(){}
    
    public void sendCard(TarjetaCRC tarjeta) {
        try{ 
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
            Statement SentenciaSQL = Conexion.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String SQL = "SELECT * FROM tarjeta_crc";
            ResultSet query = SentenciaSQL.executeQuery(SQL);

//                    "INSERT INTO tarjeta_crc ('clase', 'lista_super', 'lista_sub')"
//                    + " VALUES ('"+ tarjeta.getClase() +"', '"+ tarjeta.getListaSuper() +"', '"+ tarjeta.getListaSub() +"'";
//            ResultSet query = DBOps.getSQLQuery(SQLQueryOp, SQL);
         
            query.moveToInsertRow();
            query.updateString("clase", tarjeta.getClase());
            query.updateString("lista_super", tarjeta.getListaSuper());
            query.updateString("lista_sub", tarjeta.getListaSub());
            query.updateInt("id_proyecto", Proyecto.idProyectoActual);
            query.updateString("emailUsuario", ObtenerUsuario.usuarioLogeado.getEmail());
            query.insertRow();
            System.out.println("Inserción de Tarjeta exitosa------------------------------------------------------------");

            query.close();
            Conexion.close();
            SentenciaSQL.close();
       
            ObtenerUltimoIdTarjetaCRC obtenerUltimaTarjeta = new ObtenerUltimoIdTarjetaCRC();
            int id = obtenerUltimaTarjeta.getUltimoId();

            for(TablaTCRC tabla : tarjeta.getTablaTarjetaCRC()){
                System.out.println("Insertando la tarjeta con id: " +id);
                new GuardarTablaTCRC(id, tabla.getResponsabilidad(), tabla.getColaborador());
            }
               }
        catch (ClassNotFoundException e) {
          System.out.println("Clase no encontrada");
        }
        catch (SQLException e) {
          System.out.println(e);
        } 
    }
}
