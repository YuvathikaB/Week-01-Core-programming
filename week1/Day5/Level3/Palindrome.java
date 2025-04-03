package level3;
import java.util.*;
public class Palindrome {
    public static boolean iterative(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean recursive(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return recursive(str, start + 1, end - 1);
    }
    public static boolean charArray(String str) {
        char[] orig = str.toCharArray();
        char[] reverse = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            reverse[i] = orig[str.length() - 1 - i];
        }
        return new String(orig).equals(new String(reverse));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        boolean r1 = iterative(str);
        boolean r2 = recursive(str, 0, str.length() - 1);
        boolean r3 = charArray(str);
        System.out.println("Iterative Method: " + r1);
        System.out.println("Recursive Method: " + r2);
        System.out.println("Character Array Method: " + r3);
    }
}

