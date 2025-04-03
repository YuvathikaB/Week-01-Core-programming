package level2;
import java.util.*;
public class VoteString {
    public static int[] agesArr(int n){
        int[] ages=new int[n];
        Random rand=new Random();
        for(int i=0;i< ages.length;i++){
            ages[i]=rand.nextInt(90)+10;
        }
        return ages;
    }
    public static String[][] voteEligibility(int[] ages) {
        String[][] res = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                res[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                res[i][1] = "Can Vote";
            } else {
                res[i][1] = "Cannot Vote";
            }
        }
        return res;
    }
    public static void displayTable(String[][] res) {
        System.out.println("Age\t\tEligibility");
        for (String[] row : res) {
            System.out.println(row[0] + "\t\t " + row[1]);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        int[] ages = agesArr(n);
        String[][] votingResults = voteEligibility(ages);
        displayTable(votingResults);
    }
}
