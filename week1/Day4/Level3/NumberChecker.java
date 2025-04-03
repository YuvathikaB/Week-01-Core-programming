package level3;
import java.util.*;
public class NumberChecker {
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
    public static boolean Armstrong(int[] digits,int num){
        int c=digits.length;
        int s=0;
        for(int i=0;i<c;i++){
            s+=Math.pow(digits[i],c);
        }
        return s==num;
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
    public static int[] Largest(int[] digits){
        int large=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<digits.length;i++){
            if (digits[i] > large) {
                second = large;
                large = digits[i];
            } else if (digits[i] > second && digits[i] != large) {
                second = digits[i];
            }
        }
        return new int[]{large, second};
    }
    public static int[] smallest(int[] digits){
        int small=Integer.MAX_VALUE;
        int secondSmall=Integer.MAX_VALUE;
        for(int i=0;i<digits.length;i++){
            if (digits[i] < small) {
                secondSmall = small;
                small = digits[i];
            } else if (digits[i] < secondSmall && digits[i] !=small) {
                secondSmall = digits[i];
            }
        }
        return new int[]{small, secondSmall};
    }
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=scanner.nextInt();
        int count= countDigit(num);
        int[] digits=digitsArr(num);
        boolean isDuck = Duck(digits);
        System.out.println("Is Duck Number: " + isDuck);
        boolean isArmstrong = Armstrong(digits, num);
        System.out.println("Is Armstrong Number: " + isArmstrong);
        int[]  largestAndSecondLargest = Largest(digits);
        System.out.println("Largest digit: " + largestAndSecondLargest[0]);
        System.out.println("Second largest digit: " + largestAndSecondLargest[1]);
        int[] smallestAndSecondSmallest = smallest(digits);
        System.out.println("Smallest digit: " + smallestAndSecondSmallest[0]);
        System.out.println("Second smallest digit: " + smallestAndSecondSmallest[1]);
    }
}
