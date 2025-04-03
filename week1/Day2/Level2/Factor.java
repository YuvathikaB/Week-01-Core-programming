import java.util.Scanner;
public class Factor{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int  n = input.nextInt();
        if (n > 0) {
            System.out.println("Factors of " + n + " are:");
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Enter a positive integer.");
        }
    }
}
