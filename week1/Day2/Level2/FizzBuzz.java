import java.util.Scanner;
public class FizzBuzz{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
		if (n>0){
			for (int i = 1; i <= n; i++) {
				if(i%3==0 && i%5==0){
					System.out.print("FizzBuzz ");
				} else if(i%3==0){
					System.out.print("Fizz ");
				}else if(i%5==0){
					System.out.print("Buzz ");
				}else{
					System.out.print(i+" ");
				}
			}		
		}else{
			System.out.print("Enter positive integer");
        }
    }
}