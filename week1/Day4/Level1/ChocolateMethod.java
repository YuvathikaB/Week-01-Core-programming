package level1;
import java.util.*;
public class ChocolateMethod {
    public static void findRemAndQuo(int numberOfChocolates, int numberOfChildren) {
        if (numberOfChildren == 0) {
            System.out.println("Cannot divide chocolates among 0 children.");
            return;
        }
        int perChild = numberOfChocolates / numberOfChildren;
        int remaining = numberOfChocolates % numberOfChildren;
        System.out.println("Each child gets " + perChild + " chocolates.");
        System.out.println("Remaining chocolates: " + remaining);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter the number of children: ");
        int children = sc.nextInt();
        findRemAndQuo(chocolates, children);
    }
}
