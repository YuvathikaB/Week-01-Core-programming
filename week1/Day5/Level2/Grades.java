package level2;
import java.util.*;
public class Grades {
    public static int[][] scoresArr(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 10 + rand.nextInt(90);
            scores[i][1] = 10 + rand.nextInt(90);
            scores[i][2] = 10 + rand.nextInt(90);
        }
        return scores;
    }
    public static double[][] Statistics(int[][] scores) {
        int size = scores.length;
        double[][] stats = new double[size][4];
        for (int i = 0; i < size; i++) {
            int tot = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = tot / 3.0;
            double percentage = (tot / 300.0) * 100.0;
            stats[i][0] = tot;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }
    public static String[] gradesArr(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            }
            else if (percentage >= 70 && percentage <=79) {
                grades[i] = "B";
            }
            else if (percentage >= 60 && percentage <=69) {
                grades[i] = "C";
            }
            else if (percentage >= 50 && percentage <=59) {
                {
                    grades[i] = "D";
                }
            }
            else if (percentage >= 40 && percentage <=49) {
                grades[i] = "E";
            }
            else {
                grades[i] = "R";
            }
        }
        return grades;
    }
    public static void display(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("Student\tPhysics\tChem\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t\t" + scores[i][0] + "\t\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t\t"
                    + (int) stats[i][0] + "\t\t" + stats[i][1] + "\t\t" + stats[i][2] + "%\t\t" + grades[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        int[][] scores = scoresArr(students);
        double[][] stats = Statistics(scores);
        String[] grades = gradesArr(stats);
        display(scores, stats, grades);
    }
}

