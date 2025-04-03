package level3;
import java.util.*;
public class NumberChecker2 {
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
    public static int sum(int[] digits){
        int s=0;
        for(int i=0;i<digits.length;i++){
            s+=digits[i];
        }
        return s;
    }
    public static int sumSq(int[] digits){
        int ss=0;
        for(int i=0;i<digits.length;i++){
            ss+=Math.pow(digits[i],2);
        }
        return ss;
    }
    public static boolean harshad(int num, int[] digits){
        int s=sum(digits);
        if(num%s==0){
            return true;
        }
        return false;
    }
    public static int[][] frequency(int num, int[] digits){
        int[] digit=digitsArr(num);
        int[][] freq=new int[10][2];
        for(int i=0;i<10;i++){
            freq[i][0]=i;
            freq[i][1]=0;
        }
        for(int i=0;i<digit.length;i++){
            freq[digits[i]][1]++;
        }
        return freq;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        System.out.print("Digits of the number : ");
        int[] digits=digitsArr(num);
        for(int i=0;i<digits.length;i++){
            System.out.print(digits[i]+ " ");
        }
        System.out.println();
        System.out.println("The sum of digits of number : "+sum(digits));
        System.out.println("The sum of square of digits of the number : "+sumSq(digits));
        System.out.println("It is a harshad number : "+(harshad(num,digits)? "Yes": "No"));
        System.out.println("The frequency of each digit in the number: ");
        int[][] freq=frequency(num,digits);
        for(int i=0;i<10;i++){
            if (freq[i][1]>0){
                System.out.println(freq[i][0]+ " : "+freq[i][1]+ " times. ");
            }
        }
    }
}
