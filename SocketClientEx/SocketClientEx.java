import java.io.*;
import java.net.*;


public class SocketClientEx {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);
            System.out.println("Connected to server on port 12345");

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.write("Hello, Server!");
            writer.newLine();
            writer.flush();
            socket.close();

        } catch(IOException e) {
            System.out.println("Io Exception: " + e.getMessage());
        }
    }
}
