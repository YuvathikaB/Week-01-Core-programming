import java.util.Scanner;
public class TemperatureConversion{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature(c): ");
		double celsius= input.nextInt();
		double fahrenheit=(celsius*9/5)+32;
		System.out.println(celsius+ " celsius is " +String.format("%.2f",fahrenheit)+" fahrenheit");
	}
}