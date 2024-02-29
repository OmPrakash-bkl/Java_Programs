
public class MultipleCatEx {
    public static void main(String[] args)     {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds: " + e.getMessage());
        } catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
