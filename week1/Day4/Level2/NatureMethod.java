package level2;
import java.util.*;
public class NatureMethod {
    public static String Positive(int num) {
        if (num > 0) {
            return "positive";
        } else if (num < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }

    public static String Even(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static int compare(int n1, int n2) {
        if (n1 > n2) {
            return 1;
        } else if (n1 == n2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            System.out.println(num + " -> " +Positive(num) + " , " + Even(num));
        }
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        int comp = compare(first, last);
        if (comp == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comp == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }
    }
}

