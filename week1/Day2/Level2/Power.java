import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();
        if (number > 0 && power >= 0) {
            int result = 1;
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println(number + " power " + power + " is: " + result);
        } else {
            System.out.println("Enter positive integers for both number and power.");
        }
    }
}
