import java.util.Scanner;

public class DummyProg {
    public static void main(String[] args) {
        // Using Scanner class
        Scanner scanner = new Scanner(System.in);

        // Example with nextInt() and nextLine()
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt(); // Read an integer
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine(); // Read a string

        System.out.println("Integer entered: " + intValue);
        System.out.println("String entered: " + stringValue);

        // Close the scanner
        scanner.close();
    }
}
