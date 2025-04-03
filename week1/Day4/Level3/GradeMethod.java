package level3;
import java.util.*;
public class GradeMethod {
    public static int[][] scoresArr(int n) {
        int[][] scores = new int[n][3];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            scores[i][0] = 10 + rand.nextInt(90);
            scores[i][1] = 10 + rand.nextInt(90);
            scores[i][2] = 10 + rand.nextInt(90);
        }
        return scores;
    }
    public static double[][] resultsArr(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(avg);
            results[i][2] = Math.round(percent);
        }
        return results;
    }
    public static void scorecard(int[][] scores, double[][] results) {
        System.out.println("S.NO\tPhy\t\tChem\tMaths\tTotal\tAverage  \tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t\t" + scores[i][0] + "\t\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[][] studentScores = scoresArr(n);
        double[][] results = resultsArr(studentScores);
        scorecard(studentScores, results);
    }
}

