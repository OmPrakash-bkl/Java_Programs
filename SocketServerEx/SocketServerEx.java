import java.io.*;
import java.net.*;

public class SocketServerEx {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server waiting for client on port 12345...");

            Socket socket = serverSocket.accept();

            System.out.println("Accepted connection from: " + socket);

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String message = reader.readLine();
            System.out.println("Received message: " + message);

            serverSocket.close();

        } catch(IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }
    }
}
