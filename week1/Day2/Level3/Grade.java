import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        int physics = input.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = input.nextInt();
        System.out.print("Enter marks in Maths: ");
        int maths = input.nextInt();
        if (physics >= 0 && physics <= 100 &&
            chemistry >= 0 && chemistry <= 100 &&
            maths >= 0 && maths <= 100) {
            int totalMarks = physics + chemistry + maths;
            double average = totalMarks / 3.0;
            System.out.println("Average Marks: " + String.format("%.2f",average));
            String grade, remarks;
            if (average >= 80) {
                grade = "A";
                remarks = "(Level 4, above agency-normalized standards)";
            } else if (average >= 70) {
                grade = "B";
                remarks = "(Level 3, at agency-normalized standards)";
            } else if (average >= 60) {
                grade = "C";
                remarks = "(Level 2, below, but approaching agency-normalized standards)";
            } else if (average >= 50) {
                grade = "D";
                remarks = "(Level 1, well below agency-normalized standards)";
            } else if (average >= 40) {
                grade = "E";
                remarks = "(Level 1-, too below agency-normalized standards)";
            } else {
                grade = "R";
                remarks = "(Remedial standards)";
            }
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);

        } else {
            System.out.println("Enter valid marks between 0 and 100 for each subject.");
        }
    }
}