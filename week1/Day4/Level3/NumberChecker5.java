package level3;
import java.util.*;
public class NumberChecker5 {
    public static int[] Factors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        int[] factor = new int[count];
        int idx = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factor[idx++] = i;
            }
        }
        return factor;
    }
    public static int greatest(int num) {
        int[] factor=Factors(num);
        return factor[factor.length-1];
    }
    public static int sum(int num) {
        int[] factor = Factors(num);
        int s = 0;
        for (int i = 0; i < factor.length; i++) {
            s += factor[i];
        }
        return s;
    }
    public static long product(int num) {
        int[] factor = Factors(num);
        long prod = 1;
        for (int i = 0; i < factor.length; i++) {
            prod *= factor[i];
        }
        return prod;
    }
    public static long cube(int num) {
        int[] factor = Factors(num);
        long prod = 1;
        for (int i = 0; i < factor.length; i++) {
            prod *= Math.pow(factor[i], 3);
        }
        return prod;
    }
    public static boolean perfect(int num) {
        return sum(num) == num;
    }
    public static boolean abundant(int num) {
        return sum(num) > num;
    }
    public static boolean deficient(int num) {
        return sum(num) < num;
    }
    public static boolean strong(int num) {
        int s = 0;
        while (num > 0) {
            s += factorial(num % 10);
            num /= 10;
        }
        return s == num;
    }
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        int[] factor = Factors(num);
        System.out.print("Factors : ");
        for (int i = 0; i < factor.length; i++) {
            System.out.print(factor[i] + " ");
        }
        System.out.println();
        System.out.println("greatest factor of " + num + " : " + greatest(num));
        System.out.println("sum of the factors of " + num + " : " + sum(num));
        System.out.println("product of the factors of " + num + " : " + product(num));
        System.out.println("product of cube of the factors of " + num + " : " + cube(num));
        System.out.println("perfect number : " + (perfect(num) ? "YES" : "NO"));
        System.out.println("abundant number : " + (abundant(num) ? "YES" : "NO"));
        System.out.println("deficient number : " + (deficient(num) ? "YES" : "NO"));
        System.out.println("strong number : " + (strong(num) ? "YES" : "NO"));
    }
}






