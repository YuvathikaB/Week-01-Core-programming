package Extra;
import java.util.*;
public class Lexicographic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String s1 = sc.nextLine().toLowerCase();
        System.out.print("Enter String 2: ");
        String s2 = sc.nextLine().toLowerCase();
        int min = Math.min(s1.length(), s2.length());
        int res = 0;
        for (int i = 0; i < min; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 < c2) {
                res = -1;
                break;
            } else if (c1 > c2) {
                res = 1;
                break;
            }
        }
        if (res == 0) {
            if (s1.length() < s2.length()) {
                res = -1;
            } else if (s1.length() > s2.length()) {
                res = 1;
            }
        }
        if (res == -1) {
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
        } else if (res == 1) {
            System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\" in lexicographical order");
        } else {
            System.out.println("\"" + s1 + "\" is equal to \"" + s2 + "\"");
        }
    }
}
