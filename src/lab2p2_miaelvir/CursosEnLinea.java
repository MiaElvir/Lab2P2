
package lab2p2_miaelvir;

public class CursosEnLinea {
    
    String titulo, instructor, duracion, plataforma; 

    public CursosEnLinea(String titulo, String instructor, String duracion, String plataforma) {
        this.titulo = titulo;
        this.instructor = instructor;
        this.duracion = duracion;
        this.plataforma = plataforma;
    }

    public CursosEnLinea() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Cursos En Linea: " + "titulo: " + titulo + " || instructor: " + instructor + " || duracion: " + duracion + " || plataforma: " + plataforma;
    }
    
    
    
}
