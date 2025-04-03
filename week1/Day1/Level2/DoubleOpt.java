import java.util.Scanner;
public class DoubleOpt{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		double a = input.nextDouble();
		System.out.print("Enter the value of b: ");
		double b = input.nextDouble();
		System.out.print("Enter the value of c: ");
		double c = input.nextDouble();
		double d=a+b*c;
		double e=a*b+c;
		double f=c+a/b;
		double g=a%b+c;
		System.out.println("a + b *c = "+d);
		System.out.println("a * b +c = "+e);
		System.out.println("c + a / b = "+f);
		System.out.println("a % b + c = "+g);	
	}
}