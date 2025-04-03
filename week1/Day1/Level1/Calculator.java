import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		double number1= input.nextDouble();
		System.out.print("Enter number 2: ");
		double number2= input.nextDouble();
	    double a=number1+number2;
		double s=number1-number2;
		double m=number1*number2;
		double d=number1/number2;
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+ " and "+number2 +" is "+ a +" , "+s+" , "+m+ " and "+ d);
		
}
}