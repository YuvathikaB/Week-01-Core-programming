import java.util.Scanner;
public class MultArr{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number= input.nextInt();
		int multiplicationResult[]=new int[4];
		for (int i=6;i<10;i++){
			multiplicationResult[i-6]=number*i;
		}
		for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i-6]);
        }
        input.close(); 
    }
}
		
		
		