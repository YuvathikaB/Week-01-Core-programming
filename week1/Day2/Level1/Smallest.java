import java.util.Scanner;
public class Smallest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int n1= input.nextInt();
		System.out.print("Enter number 2: ");
		int n2= input.nextInt();
		System.out.print("Enter number 3: ");
		int n3= input.nextInt();
		if (n1<n2 && n1<n3){
			System.out.println("The first number is the smallest");
		}
		else{
			System.out.println("The first number is not the smallest");
		}
	}
}