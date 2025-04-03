import java.util.Scanner;
public class FactorialFor{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		if(n>=0){
			int fact=1;
			for(int i=1;i<=n;i++){
				fact*=i;
			}
			System.out.println("The factorial of "+n +" is : "+fact);
		}
        else if (n==0){
			System.out.println("The factorial of "+n+" is 1");
		}
		else{
			System.out.println("Enter a valid positive integer.");
		}
	}
}