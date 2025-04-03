package level3;
import java.util.*;
public class BMIStatus {
    public static String[][] BMIAndStatus(int[][] data) {
        String[][] res = new String[10][4];
        for (int i = 0; i < 10; i++) {
            int weight = data[i][0];
            int heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obesity";
            }
            res[i][0] = String.valueOf(heightCm);
            res[i][1] = String.valueOf(weight);
            res[i][2] = String.format("%.2f", bmi);
            res[i][3] = status;
        }
        return res;
    }
    public static void display(String[][] data) {
        System.out.println("Person  Height   Weight   BMI     Status");
        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + "       " + data[i][0] + "       " + data[i][1] + "      " + data[i][2] + "    " + data[i][3]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] data = new int[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextInt();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextInt();
        }
        String[][] result = BMIAndStatus(data);
        display(result);
    }
}
