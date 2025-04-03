package level2;
import java.util.*;
public class LeapMethod {
    public static boolean leapYr(int n) {
        if (n < 1582) {
            System.out.println("Enter year > 1582");
            return false;
        }
        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year > 1582 : ");
        int n = sc.nextInt();
        boolean leap=leapYr(n);
        if(leap){
            System.out.println(n+" is a leap year");
        }else{
            System.out.println(n+" is not a leap year");
        }
    }
}
