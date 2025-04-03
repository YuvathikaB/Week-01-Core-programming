package Problems;
import java.util.*;
public class Palindrome {
    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }
    public static boolean palindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void result(boolean result) {
        if (result) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
    }
    public static void main(String[] args) {
        String input = getInput();
        boolean result = palindrome(input);
        result(result);
    }
}
