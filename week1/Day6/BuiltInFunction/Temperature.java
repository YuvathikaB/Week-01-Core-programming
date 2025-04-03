package Problems;
import java.util.*;
public class Temperature {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for Fahrenheit to Celsius or 2 for Celsius to Fahrenheit: ");
        int choice = sc.nextInt();
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();
        switch (choice) {
            case 1:
                double celsius = fahrenheitToCelsius(temperature);
                System.out.println(String.format("%.2f Fahrenheit is %.2f Celsius.", temperature, celsius));
                break;
            case 2:
                double fahrenheit = celsiusToFahrenheit(temperature);
                System.out.println(String.format("%.2f Celsius is %.2f Fahrenheit.", temperature, fahrenheit));
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
