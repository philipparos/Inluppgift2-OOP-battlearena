package battlearena.serverclient;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {

    public void readMatchResults() {
        Path path = Path.of("matchResults.txt");

        if(!Files.exists(path)){
            System.out.println("No match results found");
            return;
        }

        try {
            String content = Files.readString(path);
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Could not read file with results");
        }
    }
}
