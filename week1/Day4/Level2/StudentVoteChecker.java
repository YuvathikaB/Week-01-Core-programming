package level2;
import java.util.*;
public  class StudentVoteChecker {
     public static boolean canStudentVote(int age) {
            if (age < 0) {
                return false;
            } else if (age >= 18) {
                return true;
            }
            return false;
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            if(canStudentVote(ages[i])){
                System.out.println("Student "+(i+1)+" can vote.");
            }
            else{
                System.out.println("Student "+(i+1)+" cannot vote.");
            }
            System.out.println();
        }
    }
}







