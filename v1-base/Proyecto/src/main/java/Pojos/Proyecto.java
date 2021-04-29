
package Pojos;

public class Proyecto {
    
    public static int idProyectoActual;
    
    private int ID;
    private String nombre;
    private String descripcion;
    private String emailUsuario;

    public Proyecto(int id, String nombre, String descripcion, String emailUsuario) {
        this.ID = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.emailUsuario = emailUsuario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }
    
}
