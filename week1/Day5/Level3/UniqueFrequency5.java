package level3;
import java.util.Scanner;
public class UniqueFrequency5 {
    public static char[] uniqueCharacters(String str) {
        char[] uniqueChar = new char[str.length()];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (current == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                uniqueChar[index++] = current;
            }
        }
        char[] res = new char[index];
        for (int i = 0; i < index; i++) {
            res[i] = uniqueChar[i];
        }
        return res;
    }
    public static String[][] frequencies(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freq[c]++;
        }
        char[] uniqueChar = uniqueCharacters(str);
        String[][] result = new String[uniqueChar.length][2];
        int index = 0;
        for (int i = 0; i < uniqueChar.length; i++) {
            if (freq[uniqueChar[i]] == 1) {  // Only consider characters that appear exactly once
                result[index][0] = String.valueOf(uniqueChar[i]);
                result[index][1] = String.valueOf(freq[uniqueChar[i]]);
                index++;
            }
        }
        String[][] finalResult = new String[index][2];
        System.arraycopy(result, 0, finalResult, 0, index);
        return finalResult;
    }
    public static void display(String[][] res) {
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " : " + res[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String[][] frequencies = frequencies(str);
        display(frequencies);
    }
}