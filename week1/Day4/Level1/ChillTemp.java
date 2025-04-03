package level1;
import java.util.*;
public class ChillTemp {
    public static void calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        System.out.println("The Wind Chill Temperature is: " + String.format("%.2f",windChill));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature (°F): ");
        double temp = sc.nextDouble();
        System.out.print("Enter the wind speed (mph): ");
        double speed = sc.nextDouble();
        calculateWindChill(temp, speed);
    }
}
