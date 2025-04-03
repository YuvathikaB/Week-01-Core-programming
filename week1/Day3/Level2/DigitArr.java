import java.util.Scanner;
public class DigitArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=input.nextInt();
		int maxDigit=10;
		int index=0;
		int[] digit=new int[maxDigit];
		while (num != 0 && index < maxDigit) {
            digit[index++] = num % 10; 
            num /= 10;                 
        }
        int largest = 0;
		int second=0;
		for (int i = 0; i < index; i++) {
            if (digit[i] > largest) {
                second = largest;  
                largest = digit[i];      
            } 
			else if (digit[i] > second && digit[i] != largest) {
                second = digit[i]; 
            }
        }
		System.out.println();
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + second);
    }
}