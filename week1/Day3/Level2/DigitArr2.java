import java.util.Scanner;
public class DigitArr2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int maxDigit = 10;  
        int[] digit = new int[maxDigit];
        int index = 0;
        while (num != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < index; i++) {
                    temp[i] = digit[i];
                }
                digit = temp;
            }
            digit[index++] = num % 10; 
            num /= 10;                  
        }
        int largest = 0;
        int second = 0;
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