import java.util.Scanner;
public class Multiples2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();
        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 are:");
            int i = 100;
            while (i >= 1) {
                if (i % number == 0) {
                    System.out.println(i);
                }
                i--;
            }
        } else {
            System.out.println("Enter a positive integer less than 100.");
        }
    }
}
