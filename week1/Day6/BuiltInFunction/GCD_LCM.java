package Problems;
import java.util.*;
public class GCD_LCM {
    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }
    public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int LCM(int a, int b) {
        return Math.abs(a * b) / GCD(a, b);
    }

    public static void displayResult(int gcd, int lcm) {
        System.out.println("The GCD is: " + gcd);
        System.out.println("The LCM is: " + lcm);
    }
    public static void main(String[] args) {
        int num1 = getInput();
        int num2 = getInput();
        int gcd = GCD(num1, num2);
        int lcm = LCM(num1, num2);
        displayResult(gcd, lcm);
    }
}
