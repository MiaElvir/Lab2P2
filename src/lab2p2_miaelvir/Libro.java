
package lab2p2_miaelvir;

import java.util.Date;

public class Libro {
    
    String titulo, autor,genero, año;
    boolean disponibilidad; 

    public Libro(String titulo, String autor, String genero, String año, boolean disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.año = año;
        this.disponibilidad = disponibilidad;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
     
    
    
    
    
    
}
