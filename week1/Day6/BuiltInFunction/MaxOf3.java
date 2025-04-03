package Problems;
import java.util.*;
public class MaxOf3 {
    public static int getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static int findMax(int n1, int n2, int n3) {
        if (n1 >= n2 && n1 >= n3) {
            return n1;
        } else if (n2 >= n1 && n2 >= n3) {
            return n2;
        } else {
            return n3;
        }
    }

    public static void main(String[] args) {
        int n1 = getInput("Enter number 1: ");
        int n2 = getInput("Enter number 2: ");
        int n3 = getInput("Enter number 3: ");
        int max = findMax(n1, n2, n3);
        System.out.println("The maximum value is: " + max);
    }
}
