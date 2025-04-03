import java.util.Scanner;
public class Side{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter perimeter: ");
		double perimeter= input.nextInt();
		double side=perimeter/4;
		System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
	}
}