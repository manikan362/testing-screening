import java.util.Scanner;

public class Calculator {
    double a, b;
    String operation;

    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    public double calculate() {
        switch (operation) {
            case "add": return a + b;
            case "subtract": return a - b;
            case "multiply": return a * b;
            case "divide":
                if (b != 0) return a / b;
                else {
                    System.out.println("Division by zero error");
                    return 0;
                }
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation: ");
        String op = sc.next();

        Calculator calc = new Calculator(a, b, op);
        System.out.println("Result: " + calc.calculate());
    }
}
#=========================================================================

output :
Enter a: 10
Enter b: 5
Enter operation: add
Result: 15.0
