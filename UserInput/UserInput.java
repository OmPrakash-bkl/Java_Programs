import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = scanner.nextInt();
        int i = 1;

        while(i <= n) {
            System.out.println("Count: "+i);
            i++;
        }
        scanner.close();

    }
}
