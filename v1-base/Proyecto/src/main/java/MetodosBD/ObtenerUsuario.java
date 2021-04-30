package MetodosBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Pojos.Usuario;


public class ObtenerUsuario {
    
    private Usuario usuario;
    public static Usuario usuarioLogeado;

    public ObtenerUsuario(String emailForm, String passwordForm){
        DB DBOps = new DB();
        DBOps.openConn();
        Statement SQLQueryOp = DBOps.getSQLQueryOp();
        String SQL = "SELECT * FROM usuario";
        ResultSet Usuarios = DBOps.getSQLQuery(SQLQueryOp, SQL);
        try{
            while (Usuarios.next()) {
                int idBD = Integer.parseInt(Usuarios.getString("id"));
                String emailBD = Usuarios.getString("email");
                String passwordBD = Usuarios.getString("password");
                if ( emailBD.equals(emailForm) && passwordBD.equals(passwordForm) ){
                    this.usuario = new Usuario(idBD, emailForm, passwordForm);
                    usuarioLogeado = this.usuario;
                    System.out.println("Ingreso Correcto");
                    break;
                }
            }     
            Usuarios.close();
            DBOps.closeConn();
        }catch (SQLException e) {
            System.out.println(e);
        }    
    }

    public Usuario obtenerUsuarioSesion() {
      return usuario;
    }
}

