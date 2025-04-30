import java.util.List;

/**CRUD de Playlists - TP03 Ejercicio 2
 * <p>
 * Trabajo Práctico N03 de la materia Laboratorio de Programación (2025) 
 * de la Licenciatura en Sistemas de la Universidad Nacional de la Patagonia Austral (UNPA-UARG).
 * </p>
 * <p>
 * Clase que representa una lista de reproducción de música (playlist).
 * <p>
 * Esta clase encapsula la información sobre el nombre de la playlist, el creador,
 * la lista de canciones y la duración total de la lista de reproducción (en minutos).
 * </p>
 *
 * <h2>Propiedades:</h2>
 * <ul>
 *   <li><b>nombre</b>: Nombre de la playlist.</li>
 *   <li><b>creador</b>: Nombre de quien crea la playlist.</li>
 *   <li><b>canciones</b>: Lista de nombres de canciones incluidas en la playlist.</li>
 *   <li><b>duracionTotal</b>: Duración total de la playlist en minutos.</li>
 * </ul>
 *
 * @author Nicolas Butterfield
 * @version 1.0
 * @since Abril 2025
 */
public class Playlist {

    private String nombre;
    private String creador;
    private List<String> canciones;
    private int duracionTotal; // en minutos

    /**
     * Constructor para crear una nueva instancia de la clase Playlist.
     *
     * @param nombre        Nombre de la playlist.
     * @param creador       Nombre del creador de la playlist.
     * @param canciones     Lista de canciones en la playlist.
     * @param duracionTotal Duración total de la playlist en minutos.
     */
    public Playlist(String nombre, String creador, List<String> canciones, int duracionTotal) {
        this.nombre = nombre;
        this.creador = creador;
        this.canciones = canciones;
        this.duracionTotal = duracionTotal;
    }

    /**
     * Establece el nombre de la playlist.
     *
     * @param nombre El nombre de la playlist.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el creador de la playlist.
     *
     * @param creador El nombre del creador de la playlist.
     */
    public void setCreador(String creador) {
        this.creador = creador;
    }

    /**
     * Establece la lista de canciones de la playlist.
     *
     * @param canciones Lista de nombres de canciones.
     */
    public void setCanciones(List<String> canciones) {
        this.canciones = canciones;
    }

    /**
     * Establece la duración total de la playlist en minutos.
     *
     * @param duracionTotal Duración total de la playlist en minutos.
     */
    public void setDuracionTotal(int duracionTotal) {
        this.duracionTotal = duracionTotal;
    }

    /**
     * Obtiene el nombre de la playlist.
     *
     * @return El nombre de la playlist.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el creador de la playlist.
     *
     * @return El nombre del creador de la playlist.
     */
    public String getCreador() {
        return creador;
    }

    /**
     * Obtiene la lista de canciones de la playlist.
     *
     * @return Lista de canciones.
     */
    public List<String> getCanciones() {
        return canciones;
    }

    /**
     * Obtiene la duración total de la playlist en minutos.
     *
     * @return Duración total en minutos.
     */
    public int getDuracionTotal() {
        return duracionTotal;
    }
}
