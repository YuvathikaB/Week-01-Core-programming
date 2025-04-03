import java.util.Scanner;
public class Factor2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int  n = input.nextInt();
        if (n > 0) {
            System.out.println("Factors of " + n + " are:");
            int i = 1;
            while (i <= n) {
                if (n % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Enter a positive integer.");
        }
    }
}
