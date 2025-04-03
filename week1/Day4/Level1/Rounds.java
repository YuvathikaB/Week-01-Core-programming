package level1;
import java.util.*;
public class Rounds {
    public static void calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distanceToCover = 5 * 1000;
        double rounds = distanceToCover / perimeter;
        System.out.println("The athlete needs to complete " + Math.ceil(rounds) + " rounds to complete a 5 km run.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side of the park (m): ");
        double a = sc.nextDouble();
        System.out.print("Enter the second side of the park (m): ");
        double b = sc.nextDouble();
        System.out.print("Enter the third side of the park (m): ");
        double c = sc.nextDouble();
        System.out.println();
        calculateRounds(a, b, c);
    }
}