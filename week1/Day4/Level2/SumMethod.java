package level2;
import java.util.*;
public class SumMethod {
    public static int recursive(int n){
        if(n==1){
            return 1;
        }
        else{
            return n + recursive(n-1);
        }
    }
    public static int formula(int n){
        return (n*(n+1))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number");
            return;
        }
        int s1 = recursive(n);
        int s2 = formula(n);
        System.out.println("Sum using recursion : " + s1);
        System.out.println("Sum using formula : " + s2);
        if (s1 == s2) {
            System.out.print("Both are equal");
        } else {
            System.out.print("They do not match");
        }
    }
}
