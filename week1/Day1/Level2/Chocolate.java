import java.util.Scanner;
public class Chocolate{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of chocolates: ");
		int numberOfchocolates= input.nextInt();
		System.out.print("Enter the number of children: ");
		int numberOfChildren= input.nextInt();
		int each=numberOfchocolates/numberOfChildren;
		int rem=numberOfchocolates%numberOfChildren;
		System.out.println("The number of chocolates each child gets is "+each+" and the number of remaining chocolates are "+rem);
	}
}