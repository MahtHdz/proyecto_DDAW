/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosBD;

import Pojos.TablaTCRC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ObtenerTablaTCRC {
    private List<TablaTCRC> listaTablaTCRC = new ArrayList();

    public ObtenerTablaTCRC(int idTarjeta){
        try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
       Statement SentenciaSQL = Conexion.createStatement();
       ResultSet TarjetasTCRC = SentenciaSQL.executeQuery("SELECT * FROM tabla_crc WHERE id_tarjeta = '" + idTarjeta + "'");

       while (TarjetasTCRC.next()) {
           String responsabilidad = TarjetasTCRC.getString("responsabilidad");
           String colaborador = TarjetasTCRC.getString("colaborador");
           
           TablaTCRC tableTCRC = new TablaTCRC(responsabilidad, colaborador);
           listaTablaTCRC.add(tableTCRC);
       }
       TarjetasTCRC.close();
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
    
    public List<TablaTCRC> obtenerListaTablaTCRC() {
        return listaTablaTCRC;
    }
}
