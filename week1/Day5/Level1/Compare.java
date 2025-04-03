package level1;
import java.util.*;
public class Compare {
    public static boolean compareString(String str1, String str2) {
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
        System.out.print("Enter string 1: ");
        String str1 = scanner.next();
        System.out.print("Enter string 2: ");
        String str2 = scanner.next();
        boolean charAtRes = compareString(str1, str2);
        System.out.println("Comparison using charAt() method: " + charAtRes);
        boolean EqualsRes = str1.equals(str2);
        System.out.println("Comparison using equals() method: " + EqualsRes);
        if (charAtRes == EqualsRes) {
            System.out.println("Both methods give same result.");
        } else {
            System.out.println("The results of the two methods are different.");
        }
        scanner.close();
    }
}





