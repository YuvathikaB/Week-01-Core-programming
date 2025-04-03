package level3;
import java.util.*;
public class Collinear {
    public static boolean slope(double x1, double y1, double x2, double y2, double x3, double y3) {
        return ((y2 - y1) * (x3 - x2)) == ((y3 - y2) * (x2 - x1));
    }
    public static boolean area(double x1, double y1, double x2, double y2, double x3, double y3) {
        return 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1 and y1: ");
        double x1 = scanner.nextDouble(), y1 = scanner.nextDouble();
        System.out.println("Enter x2 and y2: ");
        double x2 = scanner.nextDouble(), y2 = scanner.nextDouble();
        System.out.println("Enter x3 and y3: ");
        double x3 = scanner.nextDouble(), y3 = scanner.nextDouble();
        System.out.println("Collinear by Slope Method : " + (slope(x1, y1, x2, y2, x3, y3) ? "Yes" : "No"));
        System.out.println("Collinear by Area Method : " + (area(x1, y1, x2, y2, x3, y3) ? "Yes" : "No"));
        scanner.close();
    }
}

