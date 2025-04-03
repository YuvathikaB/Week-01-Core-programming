package Extra;
import java.util.*;
public class SubstringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String string = sc.nextLine();
        System.out.print("Enter the substring: ");
        String substring = sc.nextLine();
        int c = 0;
        int idx = 0;
        while ((idx = string.indexOf(substring, idx)) != -1) {
            c++;
            idx += substring.length();
        }
        System.out.println(c + " times.");
    }
}
