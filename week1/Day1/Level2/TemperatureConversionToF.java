import java.util.Scanner;
public class TemperatureConversionToF{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature(f): ");
		double fahrenheit= input.nextInt();
		double celsius=(fahrenheit-32)*5/9;
		System.out.println(fahrenheit+ " fahrenheit is " +String.format("%.2f",celsius)+" celsius");
	}
}