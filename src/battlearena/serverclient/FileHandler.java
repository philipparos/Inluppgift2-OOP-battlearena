package battlearena.serverclient;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;


public class FileHandler {


    static void main(String[] args) throws IOException {


//        try(BufferedReader input = new BufferedReader(new FileReader("matchResults.txt"))) {
//            while (true) {
//                int lineNumber = 0;
//
//                String message = input.readLine();
//                if (message == null) {
//                    break;
//                }
//                lineNumber++;
//                System.out.println(lineNumber + ": " + message);
//            }
//        }


    }

    public void file() {
        Path path = Path.of("matchResults.txt");
        try {
            String content = Files.readString(path);
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Could not read file with results");
            System.out.println(e.getMessage());
        }
    }
}
