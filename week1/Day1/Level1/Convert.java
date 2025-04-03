import java.util.Scanner;
public class Convert{
	public static void main(String[] args){
		double km;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the distance in km: ");
		km = input.nextInt();
		double miles=km/1.6;
		System.out.println("The total miles is "+miles+" mile for the given "+km);
		input.close();
	}
}