import java.util.Scanner;
public class SumArr{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[] num = new double[10];
		double total=0.0;
		int index = 0;
		while(true){
			System.out.print("Enter a number and 0 or negative number to stop: ");
            double number = input.nextDouble();
			if(number<=0 || index ==10){
			break;
			}
			num[index] = number;
			index++;
		}
		System.out.println("Numbers entered: ");
		for(int i=0;i<index;i++){
		System.out.print(num[i] + " ");
			total+=num[i];
		}
		System.out.println("Total Sum:" + total);
	}
}