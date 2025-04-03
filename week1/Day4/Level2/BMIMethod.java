package level2;
import java.util.*;
public class BMIMethod {
    public static void BMI(double[][] personData) {
        for (int i=0; i<personData.length; i++) {
            double weight = personData[i][0];
            double heightCm = personData[i][1];
            double heightMeters = heightCm / 100;
            double bmi = weight / (heightMeters * heightMeters);
            personData[i][2] = bmi;
        }
    }
    public static String[] BMIStatus(double[][] personData) {
        String[] status = new String[personData.length];
        for (int i=0; i<personData.length; i++) {
            double bmi = personData[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[10][3];
        for (int i=0; i<10; i++) {
            System.out.println("Enter details of Person " + (i + 1));
            System.out.print("Enter weight (kg): ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm): ");
            personData[i][1] = scanner.nextDouble();
            BMI(personData);
            String[] status = BMIStatus(personData);
            System.out.println("Height : " + personData[i][0] + " , Weight :  " + personData[i][1] + " , BMI : " + String.format("%.2f", personData[i][2]) + " , Status : " + status[i]);
            System.out.println();
        }
    }
}
