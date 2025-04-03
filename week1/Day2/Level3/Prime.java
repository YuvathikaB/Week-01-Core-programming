import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number > 1) {
            boolean isPrime = true;  
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;  
                    break;            
                }
            }
            if (isPrime) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is not a Prime Number.");
            }
        } else {
            System.out.println("Enter a number greater than 1.");
        }
    }
}