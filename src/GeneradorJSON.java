/**
 * CRUD de Playlists - TP03 Ejercicio 2
 * <p>
 * Trabajo Práctico N03 de la materia Laboratorio de Programación (2025) 
 * de la Licenciatura en Sistemas de la Universidad Nacional de la Patagonia Austral (UNPA-UARG).
 * </p>
 * <p>
 * Este programa genera un archivo JSON que representa una lista de reproducción de música
 * utilizando la biblioteca org.json. La información generada se guarda en un archivo plano
 * y luego se imprime su contenido por consola.
 * </p>
 *
 * <h2>Librerías utilizadas</h2>
 * <ul>
 *   <li><b>org.json</b>: Para manipulación de objetos y arreglos JSON.</li>
 *   <li><b>java.io.FileWriter</b>: Para escritura en archivos.</li>
 *   <li><b>java.nio.file.Files</b> y <b>Paths</b>: Para lectura de archivos.</li>
 * </ul>
 *
 * Sistema operativo: openSUSE Tumbleweed lo mejor de lo mejor
 * Persistencia: Archivo plano (JSON)
 *
 * @author Nicolas Butterfield
 * @version 1.0
 * @since Abril 2025
 */

 import org.json.JSONArray;
 import org.json.JSONObject;
 
 import java.io.FileWriter;
 import java.io.IOException;
 import java.nio.file.Files;
 import java.nio.file.Paths;
 import java.util.Arrays;
 import java.util.List;
 
 public class GeneradorJSON {
 
     // Ruta por defecto del archivo JSON generado
     private static final String ARCHIVO_JSON = "playlist.json";
 
     /**
      * Método principal que coordina la generación del archivo JSON
      * y la impresión del contenido por consola.
      *
      * @param args Argumentos de línea de comandos (no se utilizan).
      */
     public static void main(String[] args) {
         // Datos de ejemplo
         String nombre = "Estudio con mates";
         String creador = "Nico el crack";
         List<String> canciones = Arrays.asList(
                 "La cumbia del sistema",
                 "Beethoven - Für Elise",
                 "Chayanne - Torero"
         );
 
         // Crear la playlist
         JSONObject playlist = crearPlaylist(nombre, creador, canciones);
 
         // Guardarla como archivo JSON
         guardarPlaylistEnArchivo(playlist, ARCHIVO_JSON);
 
         // Leer e imprimir el contenido del archivo
         mostrarContenidoArchivo(ARCHIVO_JSON);
     }
 
     /**
      * Crea un objeto JSON que representa una playlist musical.
      *
      * @param nombre    Nombre de la playlist.
      * @param creador   Nombre del creador de la playlist.
      * @param canciones Lista de canciones incluidas.
      * @return JSONObject con la información estructurada.
      */
     public static JSONObject crearPlaylist(String nombre, String creador, List<String> canciones) {
         JSONObject playlist = new JSONObject();
         playlist.put("nombre", nombre);
         playlist.put("creador", creador);
 
         JSONArray cancionesArray = new JSONArray();
         for (String cancion : canciones) {
             cancionesArray.put(cancion);
         }
 
         playlist.put("canciones", cancionesArray);
         return playlist;
     }
 
     /**
      * Guarda el contenido de un objeto JSON en un archivo.
      *
      * @param playlist Objeto JSON a guardar.
      * @param ruta     Ruta donde se guardará el archivo.
      */
     public static void guardarPlaylistEnArchivo(JSONObject playlist, String ruta) {
         try (FileWriter file = new FileWriter(ruta)) {
             file.write(playlist.toString(4)); // Formateado con indentación
             System.out.println("Archivo JSON guardado correctamente en: " + ruta);
         } catch (IOException e) {
             System.err.println("Error al guardar el archivo JSON:");
             e.printStackTrace();
         }
     }
 
     /**
      * Lee un archivo JSON desde disco y muestra su contenido por consola.
      *
      * @param ruta Ruta del archivo a leer.
      */
     public static void mostrarContenidoArchivo(String ruta) {
         try {
             String contenido = Files.readString(Paths.get(ruta));
             System.out.println("\nContenido del archivo JSON:");
             System.out.println(contenido);
         } catch (IOException e) {
             System.err.println("Error al leer el archivo JSON:");
             e.printStackTrace();
         }
     }
 }
 