package level1;
import java.util.*;
public class SmallLarge {
    public static void findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(Math.min(number1, number2), number3);
        int largest = Math.max(Math.max(number1, number2), number3);
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        findSmallestAndLargest(num1, num2, num3);
    }
}
