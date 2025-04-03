package level1;
import java.util.*;
public class SumMethod {
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int res = sum(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + res);
    }
}
