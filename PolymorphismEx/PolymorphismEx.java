class Calculator  {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

}
public class PolymorphismEx {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of Int numbers: "+ calc.add(1, 2));
        System.out.println("Sum of Double numbers: "+ calc.add(44.5, 66.5));
    }
}
