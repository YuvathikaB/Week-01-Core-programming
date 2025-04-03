package level1;
import java.util.*;
public class Trig {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radian = Math.toRadians(angle);
        return new double[]{Math.sin(radian), Math.cos(radian), Math.tan(radian)};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an angle : ");
        double angle = sc.nextDouble();
        double[] res = calculateTrigonometricFunctions(angle);
        System.out.println("Sine of " + angle + "°: " + String.format("%.2f",res[0]));
        System.out.println("Cosine of " + angle + "°: " + String.format("%.2f",res[1]));
        System.out.println("Tangent of " + angle + "°: " + String.format("%.2f",res[2]));
        sc.close();
    }
}
