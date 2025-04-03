import java.util.Scanner;
public class BMI2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int num = input.nextInt();
        double[][] personData = new double[num][3];
        String[] weightStatus = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter height of person " + (i + 1) + " (m) : ");
            double height = input.nextDouble();
            while (height <= 0) {
                System.out.print("Invalid height! Enter a positive value: ");
                height = input.nextDouble();
            }
            System.out.print("Enter weight of person " + (i + 1) + " (kg) : ");
            double weight = input.nextDouble();
            while (weight <= 0) {
                System.out.print("Invalid weight! Enter a positive value: ");
                weight = input.nextDouble();
            }
			System.out.println();
            personData[i][0] = height;
            personData[i][1] = weight;
            double bmi = weight / (height * height);
            personData[i][2] = bmi;
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25.0 && bmi < 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }
        System.out.println();
        for (int i = 0; i < num; i++) {
            System.out.println("Height : "+personData[i][0] + " , Weight :  " + personData[i][1] + " , BMI : " + String.format("%.2f", personData[i][2]) + " , Status : " + weightStatus[i]);
        }
    }
}
