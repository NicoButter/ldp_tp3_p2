import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class GeneradorJSON {
    public static void main(String[] args) {
        Playlist playlist = new Playlist(
            "Temazos de los 2000",
            "Nico",
            Arrays.asList("In the End", "Seven Nation Army", "Mr. Brightside"),
            14
        );

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(playlist);

        System.out.println("Contenido del JSON:");
        System.out.println(json);

        try (FileWriter writer = new FileWriter("playlist.json")) {
            writer.write(json);
            System.out.println("Archivo guardado como playlist.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
