
package lab2p2_miaelvir;


public class Usuario {
    
    String nombre, contraseña, tipo_user; 

    public Usuario(String nombre, String contraseña, String tipo_user) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.tipo_user = tipo_user;
    }

    public Usuario() {
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipo_user() {
        return tipo_user;
    }

    public void setTipo_user(String tipo_user) {
        this.tipo_user = tipo_user;
    }
    
    
    
}
