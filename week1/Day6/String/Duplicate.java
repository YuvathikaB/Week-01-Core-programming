package Extra;
import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder res = new StringBuilder();
        boolean[] seen = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen[ch]) {
                res.append(ch);
                seen[ch] = true;
            }
        }
        System.out.println(res.toString());
    }
}
