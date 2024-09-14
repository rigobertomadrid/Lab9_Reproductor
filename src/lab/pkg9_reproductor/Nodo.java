package lab.pkg9_reproductor;

public class Nodo {

    String nombreCancion;
    String nombreVisible;
    String artista;
    String duracion;
    String tipoMusica;
    String imagen;
    Nodo siguiente;

    public Nodo(String nombreCancion, String nombreVisible, String artista, String duracion, String tipoMusica, String imagen) {
        this.nombreCancion = nombreCancion;
        this.nombreVisible = nombreVisible;
        this.artista = artista;
        this.duracion = duracion;
        this.tipoMusica = tipoMusica;
        this.imagen = imagen;
        this.siguiente = null;
    }
}
