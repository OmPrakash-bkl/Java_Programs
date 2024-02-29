import java.io.FileReader;
import java.io.IOException;
public class FileReadingEx {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("example.txt");
            int character;
            while((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch(IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
