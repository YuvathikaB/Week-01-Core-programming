package level2;
import java.util.*;
public class VowelConsonant {
    public static String charType(char ch) {
        ch = (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : ch;
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }
    public static int[] vowelsConsonants(String str) {
        int v = 0, c = 0;
        for (int i = 0; i < str.length(); i++) {
            String type = charType(str.charAt(i));
            if (type.equals("Vowel"))
                v++;
            else if (type.equals("Consonant"))
                c++;
        }
        return new int[]{v, c};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int[] res = vowelsConsonants(str);
        System.out.println("Vowel(s) : " + res[0]);
        System.out.println("Consonant(s) : " + res[1]);
    }
}

