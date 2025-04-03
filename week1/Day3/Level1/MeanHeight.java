import java.util.Scanner;
public class MeanHeight{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double sum=0.0;
		double heights[]=new double[11];
		for (int i=0; i<11; i++){
			System.out.print("Enter height of player" + (i+1)+": ");
			heights[i]=input.nextDouble();
		}
		for (int i=0; i<11; i++){
			sum+=heights[i];
		}
		double mean = sum/11;
		System.out.print("The mean height of players is " + mean);
		
	}
}
