package level1;
import java.util.*;
public class Nature {
    public  static int check(int num){
        if(num>0) {
            return 1;
        }
        else if(num<0){
            return -1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = check(num);
        if (result == 1){
            System.out.println("Number is positive.");
        }
        else if (result == -1){
            System.out.println("Number is negative.");
        }
        else{
            System.out.println("Number is zero.");
        }
    }
}