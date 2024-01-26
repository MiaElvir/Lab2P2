
package lab2p2_miaelvir;

public class ConferenciasVirtuales {
    
    String titulo, conferencista, fecha, duracion, enlaceAcceso; 

    public ConferenciasVirtuales(String titulo, String conferencista, String fecha, String duracion, String enlaceAcceso) {
        this.titulo = titulo;
        this.conferencista = conferencista;
        this.fecha = fecha;
        this.duracion = duracion;
        this.enlaceAcceso = enlaceAcceso;
    }

    public ConferenciasVirtuales() {
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConferencista() {
        return conferencista;
    }

    public void setConferencista(String conferencista) {
        this.conferencista = conferencista;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getEnlaceAcceso() {
        return enlaceAcceso;
    }

    public void setEnlaceAcceso(String enlaceAcceso) {
        this.enlaceAcceso = enlaceAcceso;
    }

    @Override
    public String toString() {
        return "Conferencias Virtuales: " + "titulo: " + titulo + " || conferencista: " + conferencista + " || fecha: " + fecha + " || duracion: " + duracion + " || Enlace Acceso=" + enlaceAcceso;
    }
    
    
}
