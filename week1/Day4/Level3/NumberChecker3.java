package level3;
import java.util.*;
public class NumberChecker3 {
    public static int countDigit(int num){
        int count=0;
        if(num==0){
            return 1;
        }
        while(num!=0){
            num/=10;
            count++;
        }
        return count;
    }
    public static int[] digitsArr(int num){
        int count=countDigit(num);
        int[] digits=new int[count];
        for(int i=count-1;i>=0;i--){
            digits[i]=num%10;
            num/=10;
        }
        return digits;
    }
    public static int[] Reverse(int num){
        int count=countDigit(num);
        int[] digitsRev=new int[count];
        for(int i=0;i<count;i++){
            digitsRev[i]=num%10;
            num/=10;
        }
        return digitsRev;
    }
    public static boolean Palindrome(int[] digits,int[] digitRev){
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=digitRev[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean Duck(int[] digits){
        int c=digits.length;
        if(digits[0]==0){
            return false;
        }
        for(int i=1;i<c;i++){
            if(digits[i]==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=scanner.nextInt();
        int[] digits=digitsArr(num);
        System.out.print("The digits are : ");
        for(int i=0;i<digits.length;i++){
            System.out.print(digits[i]+" ");
        }
        System.out.println();
        int[] digitRev=Reverse(num);
        System.out.print("The digits  in reverse are : ");
        for(int i=0;i<digitRev.length;i++){
            System.out.print(digitRev[i]+" ");
        }
        System.out.println();
        if (Palindrome(digits,digitRev)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
        boolean isDuck = Duck(digits);
        System.out.println("Is Duck Number: " + isDuck);
    }
}
