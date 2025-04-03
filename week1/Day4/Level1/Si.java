package level1;
import java.util.*;
public class Si {
    public static void interest(float principal,float rate,float time){
        double si=(principal*rate*time)/100;
        System.out.println("The Simple Interest is " + si +" for Principal "+principal+" , Rate of Interest  " + rate +"  and Time "+time);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principal:");
        float p=sc.nextFloat();
        System.out.println("Enter the Rate of Interest :");
        float r=sc.nextFloat();
        System.out.println("Enter the Time:");
        float t=sc.nextFloat();
        interest(p,r,t);
    }
}