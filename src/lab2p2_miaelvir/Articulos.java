
package lab2p2_miaelvir;

public class Articulos {
    
    String titulo, autor, tema, fechaPub; 
    boolean accesoLinea; 

    public Articulos(String titulo, String autor, String tema, String fechaPub, boolean accesoLinea) {
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.fechaPub = fechaPub;
        this.accesoLinea = accesoLinea;
    }

    public Articulos() {
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

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getFechaPub() {
        return fechaPub;
    }

    public void setFechaPub(String fechaPub) {
        this.fechaPub = fechaPub;
    }

    public boolean isAccesoLinea() {
        return accesoLinea;
    }

    public void setAccesoLinea(boolean accesoLinea) {
        this.accesoLinea = accesoLinea;
    }

    @Override
    public String toString() {
        return "Articulo: " + " || titulo: " + titulo + " || autor: " + autor + " || tema: " + tema + " || fecha de Publicacion " + fechaPub + " || Acceso en Linea: " + accesoLinea;
    }
    
    
    
}
