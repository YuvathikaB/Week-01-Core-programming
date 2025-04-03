package Problems;
import java.util.*;
public class Factorial {
    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void result(int result) {
        System.out.println(result);
    }
    public static void main(String[] args) {
        int number = getInput();
        int result = factorial(number);
        result(result);
    }
}
