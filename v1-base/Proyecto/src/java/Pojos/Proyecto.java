
package Pojos;

public class Proyecto {
    
    private String nombre;
    private String descripcion;
    private String emailUsuario;

    public Proyecto(String nombre, String descripcion, String emailUsuario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.emailUsuario = emailUsuario;
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
