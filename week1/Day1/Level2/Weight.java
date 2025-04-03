import java.util.Scanner;
public class Weight{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your weight(kg): ");
		int weight= input.nextInt();
		double pound=weight/2.2;
		System.out.println("The weight of the person in pound is "+String.format("%.2f",pound)+" and in kg is "+weight);
	}
}