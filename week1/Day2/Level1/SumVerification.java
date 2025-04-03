import java.util.Scanner;
public class SumVerification{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n= input.nextInt();
		int sum=0;
		int i=1;
		if (n>0){
		  while(i<=n){
			sum+=i;
			i++;
		}
		System.out.println(sum);
		}
		else{
			System.out.println("The number "+n +" is not a natural number");
		}
		int sum2=n*(n+1)/2;
		System.out.println(sum2);
		String result= (sum==sum2) ? "correct": "incorrect";
		System.out.println(result);
		
	}
}