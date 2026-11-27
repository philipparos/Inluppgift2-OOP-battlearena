package battlearena.serverclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void sendResult(String message) {
        try (Socket socket = new Socket("localhost", 5000);
             PrintWriter outputWriter = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader inputReader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            outputWriter.println(message);
            String response = inputReader.readLine();

            if (response != null) {
                System.out.println("Server: " + response);
            }

        } catch (IOException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }
}

