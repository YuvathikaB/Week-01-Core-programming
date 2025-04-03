import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of calculations: ");
        int n = input.nextInt();
		for (int i=1;i<=n;i++){
        System.out.print("Enter the first number: ");
        double first = input.nextDouble();
        System.out.print("Enter the second number: ");
        double second = input.nextDouble();
        System.out.print("Enter the operator (+, -, *, /): ");
        String op = input.next();
        double result;
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;

            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
        }
	}
}