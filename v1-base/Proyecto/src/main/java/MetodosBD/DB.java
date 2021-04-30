/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maht_
 */
public class DB {
    
    private String DBname = "proyecto";
    private String PORT = "3306";
    private Connection Conn = null;
    private Statement SQLQueryOp = null;
    
    public DB(){}
    
    public Statement getSQLQueryOp() {
        return SQLQueryOp;
    }
    
    public void openConn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Conn = DriverManager.getConnection("jdbc:mysql://localhost:" + PORT + "/" + DBname, "root", "");
            SQLQueryOp = Conn.createStatement();
        }catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public ResultSet getSQLQuery(Statement SQLQueryOp, String SQL){
        ResultSet SQLQuery = null;
        try{
            SQLQuery = SQLQueryOp.executeQuery(SQL);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return SQLQuery;
    }
    
    public void closeConn() throws SQLException{
        Conn.close();
        SQLQueryOp.close();  
    }
    
}
