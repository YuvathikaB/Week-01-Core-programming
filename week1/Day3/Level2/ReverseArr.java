import java.util.Scanner;
public class ReverseArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (num < 0) {
            System.out.println("Enter a positive number.");
            return;
        }
        int count = 0;
        int temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int[] digit = new int[count];
        for (int i = 0; i < count; i++) {
            digit[i] = num % 10; 
            num /= 10;           
        }
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digit[i]);
        }
    }
}