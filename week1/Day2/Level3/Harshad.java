import java.util.Scanner;
public class Harshad{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int originalNum = num; 
        int sum = 0;                
        while (num != 0) {
            int digit = num % 10; 
            sum += digit;           
            num /= 10;          
        }
        if (originalNum % sum == 0) {
            System.out.println(originalNum + " is a Harshad Number.");
        } else {
            System.out.println(originalNum + " is not a Harshad Number.");
        }
    }
}
