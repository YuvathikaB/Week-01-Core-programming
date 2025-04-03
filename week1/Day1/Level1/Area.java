import java.util.Scanner;
public class Area{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter base: ");
		double base= input.nextInt();
		System.out.print("Enter height: ");
		double height= input.nextInt();
		double area=0.5*base*height;
		double inch= area/6.4516;
		System.out.println("The area in cm is "+ String.format("%.2f",area)+" and in inches is "+String.format("%.2f",inch));
	}
}