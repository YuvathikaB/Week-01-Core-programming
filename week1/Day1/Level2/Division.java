import java.util.Scanner;
public class Division{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int n1 = input.nextInt();
		System.out.print("Enter number 2: ");
		int n2 = input.nextInt();
		double quotient=n1/n2;
		int reminder=n1%n2;
		System.out.println("The quotient is "+quotient+" and reminder is "+reminder +" of two numbers "+n1+ " and "+n2);
	}
}