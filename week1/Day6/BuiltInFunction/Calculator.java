package Problems;
import java.util.*;
public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = sc.nextInt();
        System.out.print("Enter number 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter number 2: ");
        double n2 = sc.nextDouble();
        double res = 0;
        switch (choice) {
            case 1:
                res = add(n1, n2);
                System.out.println("Result: " + res);
                break;
            case 2:
                res = subtract(n1, n2);
                System.out.println("Result: " + res);
                break;
            case 3:
                res = multiply(n1, n2);
                System.out.println("Result: " + res);
                break;
            case 4:
                res = divide(n1, n2);
                if (res!=0) {
                    System.out.println("Result: " + String.format("%.2f",res));
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
