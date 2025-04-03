import java.util.Scanner;
public class BMIArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
		int n=input.nextInt();
		double[] weight=new double[n];
		double[] height=new double[n];
		double[] bmi=new double[n];
		String[] status=new String[n];
		for( int i=0;i<n;i++){
			System.out.print("Enter height of person "+(i+1)+" (m) :");
			height[i] = input.nextDouble();
            System.out.print("Enter weight of person " + (i+1) + " (kg) : ");
            weight[i] = input.nextDouble();
			System.out.println();
            bmi[i] = weight[i] / (height[i] * height[i]);
			 if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] >= 25.0 && bmi[i] < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Height : "+height[i] + " , Weight :  " + weight[i] + " , BMI : " + String.format("%.2f", bmi[i]) + " , Status : " + status[i]);
        }
    }
}
		