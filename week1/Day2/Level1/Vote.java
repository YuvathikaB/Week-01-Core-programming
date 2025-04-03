import java.util.Scanner;
public class Vote{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter age : ");
		int age= input.nextInt();
		String elig=(age>=18) ? "can vote" : "cannot vote";
		System.out.println("The person's age is " + age + " and " + elig + ".");
	}
}
		