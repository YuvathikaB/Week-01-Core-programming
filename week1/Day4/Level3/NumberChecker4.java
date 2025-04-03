package level3;
import java.util.*;
public class NumberChecker4 {
    public static boolean prime(int num){
        if(num<=1) return false;
        for(int i=2;i<num;i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean neon(int num){
        int sq=num*num;
        int s=0;
        while(sq>0){
            s+=sq%10;
            sq/=10;
        }
        return s==num;
    }
    public static boolean spy(int num){
        int s=0;
        int prod=1;
        while(num>0){
            int digit=num%10;
            s+=digit;
            prod*=digit;
            num/=10;
        }
        return s==prod;
    }
    public static boolean automorphic(int num){
        int sq=num*num;
        int c=0;
        int temp =num;
        while(temp>0){
            temp=temp/10;
            c++;
        }
        int s=sq%(int)Math.pow(10,c);
        return s==num;
    }
    public static boolean buzz(int num){
        return(num%7==0 || num%10==7);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=scanner.nextInt();
        System.out.println("prime number : "+((prime(num))?"Yes" : "No"));
        System.out.println("neon number : "+((neon(num))?"Yes" : "No"));
        System.out.println("spy number : "+((spy(num))?"Yes" : "No"));
        System.out.println("automorphic number : "+((automorphic(num))?"Yes" : "No"));
        System.out.println("buzz number : "+((buzz(num))?"Yes" : "No"));
    }
}
