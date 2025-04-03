import java.util.Scanner;
public class SimpleInterest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter principal: ");
		int principal= input.nextInt();
		System.out.print("Enter rate: ");
		int rate= input.nextInt();
		System.out.print("Enter time: ");
		int time= input.nextInt();
		int si=(principal*rate*time)/100;
		System.out.println("The Simple Interest is "+si+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
	}
}