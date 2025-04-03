package level2;
import java.util.*;
public class Length {
    public static int length(String str){
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        int calculatedLen = length(str);
        int actualLen = str.length();
        System.out.println("Calculated Length: " + calculatedLen);
        System.out.println("Actual Length: " + actualLen);
    }
}

