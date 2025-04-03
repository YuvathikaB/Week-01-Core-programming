package Problems;
import java.util.*;
public class Prime {
    public static boolean prime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (prime(number)) {
            System.out.println(number + "Prime number.");
        } else {
            System.out.println(number + "Not a prime number.");
        }
    }
}
