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
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
        Statement SentenciaSQL = Conexion.createStatement();
        ResultSet Usuarios = SentenciaSQL.executeQuery("SELECT * FROM usuario");

        while (Usuarios.next()) {
            String emailBD = Usuarios.getString("email");
            String passwordBD = Usuarios.getString("password");
            if ( emailBD.equals(emailForm) && passwordBD.equals(passwordForm) ){
                this.usuario = new Usuario(emailForm, passwordForm);
                usuarioLogeado = this.usuario;
                System.out.println("Ingreso Correcto");
                break;
            }
       }
       
       Usuarios.close();
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

    public Usuario obtenerUsuarioSesion() {
      return usuario;
    }
}

