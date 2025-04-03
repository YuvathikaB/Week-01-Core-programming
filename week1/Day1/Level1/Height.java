import java.util.Scanner;
public class Height{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your height in cm: ");
		double height= input.nextInt();
		double inch=height/2.54;
		double feet=inch/12;
		System.out.println("Your Height in cm is "+ height+" in feet is "+String.format("%.2f",feet)+" and inches is "+String.format("%.2f",inch));
	}
}