class CustomException extends Exception  {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExcepEx {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom exception for test");
        } catch(CustomException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
    }
}
