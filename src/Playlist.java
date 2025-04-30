import java.util.List;

public class Playlist {
    private String nombre;
    private String creador;
    private List<String> canciones;
    private int duracionTotal; // en minutos

    public Playlist(String nombre, String creador, List<String> canciones, int duracionTotal) {
        this.nombre = nombre;
        this.creador = creador;
        this.canciones = canciones;
        this.duracionTotal = duracionTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCreador() {
        return creador;
    }

    public List<String> getCanciones() {
        return canciones;
    }

    public int getDuracionTotal() {
        return duracionTotal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setCanciones(List<String> canciones) {
        this.canciones = canciones;
    }

    public void setDuracionTotal(int duracionTotal) {
        this.duracionTotal = duracionTotal;
    }

}
