import java.util.Scanner;
public class Divisible{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number= input.nextInt();
		if (number%5==0){
		System.out.println("The number is divisible by 5");
		}
		else{
		System.out.println("The number is not divisible by 5");
		}
	}
}