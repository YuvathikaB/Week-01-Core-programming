import java.util.Scanner;
public class Precedence{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		int a = input.nextInt();
		System.out.print("Enter the value of b: ");
		int b = input.nextInt();
		System.out.print("Enter the value of c: ");
		int c = input.nextInt();
		int d=a+b*c;
		int e=a*b+c;
		int f=c+a/b;
		int g=a%b+c;
		System.out.println("a + b *c = "+d);
		System.out.println("a * b +c = "+e);
		System.out.println("c + a / b = "+f);
		System.out.println("a % b + c = "+g);	
	}
}