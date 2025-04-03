package level1;
import java.util.*;
public class Substring {
    public static String substringCharAt(String str, int start, int end) {
        String subs = "";
        for (int i = start; i < end; i++) {
            subs += str.charAt(i);
        }
        return subs;
    }
    public static boolean compare(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();
        String substringUsingCharAt = substringCharAt(str, start, end);
        String substringUsingBuiltIn = str.substring(start, end);
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using built-in substring(): " + substringUsingBuiltIn);
        boolean comparisonResult = compare(substringUsingCharAt, substringUsingBuiltIn);
        System.out.println("The substrings are equal? " + comparisonResult);
        scanner.close();
    }
}



