import java.util.Scanner;
public class Yard{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the distance: ");
		double distance= input.nextInt();
		double yard =distance/3;
		double mile=yard/1760;
		System.out.println("The distance in yards is "+String.format("%.2f",yard)+" and in miles is "+String.format("%.2f",mile));
	}
}