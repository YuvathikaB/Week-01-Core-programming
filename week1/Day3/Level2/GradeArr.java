import java.util.Scanner;
public class GradeArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of students: ");
        int num = input.nextInt();
        double[] physicsMarks = new double[num];
        double[] chemistryMarks = new double[num];
        double[] mathsMarks = new double[num];
        double[] percentages = new double[num];
        String[] grades = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter marks of student " + (i + 1) + " : ");
            System.out.print("Physics: ");
            double physics = input.nextDouble();
            while (physics < 0) {
                System.out.println("Invalid number! Enter a positive number for physics: ");
                physics = input.nextDouble();
            }
            System.out.print("Chemistry: ");
            double chemistry = input.nextDouble();
            while (chemistry < 0) {
                System.out.println("Invalid number! Enter a positive number for chemistry: ");
                chemistry = input.nextDouble();
            }
            System.out.print("Maths: ");
            double maths = input.nextDouble();
            while (maths < 0) {
                System.out.println("Invalid number! Enter a positive number for maths: ");
                maths = input.nextDouble();
            }
			System.out.println();
            physicsMarks[i] = physics;
            chemistryMarks[i] = chemistry;
            mathsMarks[i] = maths;
            double percentage = (physics + chemistry + maths) / 3;
            percentages[i] = percentage;
            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        System.out.println();
        for (int i = 0; i < num; i++) {
            System.out.println("Student " + (i + 1) + " : Physics : " + physicsMarks[i] + 
                " , Chemistry : " + chemistryMarks[i] + " , Maths : " + mathsMarks[i] + 
                " , percentage : " + String.format("%.2f", percentages[i]) + 
                " , Grade : " + grades[i]);
        }
    }
}
