package level1;
import java.util.*;
public class ToLower {
    public static String lowercase(String s) {
        char[] lower = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                lower[i] = (char) (ch + 32);
            } else {
                lower[i] = ch;
            }
        }
        return new String(lower);
    }
    public static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String user = lowercase(str);
        String builtIn = str.toLowerCase();
        boolean equal = compare(user, builtIn);
        System.out.println("User defined Method : " + user);
        System.out.println("Built-in Method: " + builtIn);
        System.out.println(equal ? "Results are same": "They don't match");
    }
}

