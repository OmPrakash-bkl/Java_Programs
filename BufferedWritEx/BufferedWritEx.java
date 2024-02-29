import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWritEx {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hello, bye guys");
        } catch(IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
