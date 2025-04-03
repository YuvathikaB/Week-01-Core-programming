import java.util.Scanner;
public class Number{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n= input.nextInt();
		if (n>0){
			System.out.println("positive");
		}
		else if(n==0){
			System.out.println("zero");
		}
		else{
			System.out.println("negative");
	    }
	}
}