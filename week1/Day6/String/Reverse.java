package Extra;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        char[] orig = str.toCharArray();
        char[] reverse = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            reverse[i] = orig[str.length() - 1 - i];
        }
        String ans = String.valueOf(reverse);
        System.out.println(ans);
    }
}

