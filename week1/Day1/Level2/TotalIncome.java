import java.util.Scanner;
public class TotalIncome{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the salary: ");
		int salary= input.nextInt();
		System.out.print("Enter the bonus: ");
		int bonus= input.nextInt();
		int income=salary+bonus;
		System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+income);
		}
}