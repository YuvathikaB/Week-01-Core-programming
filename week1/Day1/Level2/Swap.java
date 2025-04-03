import java.util.Scanner;
public class Swap{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int n1= input.nextInt();
		System.out.print("Enter number 2: ");
		int n2= input.nextInt();
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("The swapped numbers are "+n1+" and "+n2);
	}
}