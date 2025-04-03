import java.util.Scanner;
public class Power2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();
        if (number > 0 && power >= 0) {
            int result = 1;
            int i = 1;
            while (i <= power) {
                result *= number;
                i++;
            }
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        } else {
            System.out.println("Enter positive integers for both number and power.");
        }
        input.close();
    }
}
