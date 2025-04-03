package level3;
import java.util.Scanner;
public class NonRepeat3 {
    public static char first(String str){
        int[] freq=new int[256];
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            freq[c]++;
        }
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(freq[c]==1){
                return c;
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        char result = first(str);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}

