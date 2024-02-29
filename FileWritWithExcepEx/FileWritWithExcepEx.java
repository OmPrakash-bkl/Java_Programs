
import java.io.FileReader;
import java.io.IOException;

public class FileWritWithExcepEx {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("nonexistent.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
