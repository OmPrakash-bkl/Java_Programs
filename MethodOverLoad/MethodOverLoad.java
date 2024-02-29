class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
public class MethodOverLoad {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum (int): "+ calc.add(5, 10));
        System.out.println("Sum (double): "+calc.add(2.5, 3.5));
    }
}
