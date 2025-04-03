package level2;
import java.util.*;
public class FactorMethod{
    public static int[] Factors(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        int[] factor=new int[count];
        int idx=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                factor[idx++]=i;
            }
        }
        return factor;
    }
    public static int sum(int[] factor){
        int s=0;
        for(int i=0;i<factor.length;i++) {
            s += factor[i];
        }
        return s;
    }
    public static int product(int[] factor){
        int prod=1;
        for(int i=0;i<factor.length;i++) {
            prod *= factor[i];
        }
        return prod;
    }
    public static int squareSum(int[] factor){
        int sumSq=0;
        for(int i=0;i<factor.length;i++){
            sumSq+=Math.pow(factor[i],2);
        }
        return sumSq;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int[] factor=Factors(num);
        System.out.print("The factors of " +num + ": ");
        for (int i = 0; i < factor.length; i++) {
            System.out.print(factor[i] + " ");
        }
        System.out.println();
        System.out.println("The sum of factors of " +num + ": "+sum(factor));
        System.out.println("The sum of squares of factors of " +num + ": "+squareSum(factor));
        System.out.println("The product of factors of " +num + ": "+product(factor));
    }
}

