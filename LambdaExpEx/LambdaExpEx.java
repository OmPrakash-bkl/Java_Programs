interface MyInterface {
    void display(String message);
}

public class LambdaExpEx {
    public static void main(String[] args) {
        MyInterface myInterface = (message) -> {
            System.out.println("Message: " + message);
        };
        myInterface.display("Hello, Prakash!");
    }
}
