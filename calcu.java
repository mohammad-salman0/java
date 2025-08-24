interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);
    int multiply(int a, int b);
    double divide(int a, int b);
}

class SimpleCalculator implements Calculator {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return (double) a / b;
    }
}

public class Program6_Calculator {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();

        try {
            System.out.println("Add: " + calc.add(10, 5));
            System.out.println("Subtract: " + calc.subtract(10, 5));
            System.out.println("Multiply: " + calc.multiply(10, 5));
            System.out.println("Divide: " + calc.divide(10, 0));  // triggers exception
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
