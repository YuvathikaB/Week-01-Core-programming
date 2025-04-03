package level1;
import java.util.*;
public class DivisionMethod {
    public static void findRemainderAndQuotient(int number, int divisor) {
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
            return;
        }
        int quotient = number / divisor;
        int remainder = number % divisor;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();
        findRemainderAndQuotient(num, divisor);
    }
}