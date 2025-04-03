package level2;
import java.util.*;
public class Split2D {
    public static int stringLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
    public static String[] splitText(String text) {
        int length = stringLength(text);
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int[] spaceIndex = new int[spaceCount + 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[index++] = i;
            }
        }
        spaceIndex[index] = length;
        String[] word = new String[spaceCount + 1];
        int start = 0;
        for (int i = 0; i <= spaceCount; i++) {
            word[i] = text.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }
        return word;
    }
    public static String[][] wordsLength(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(stringLength(words[i]));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[][] wordLengths = wordsLength(splitText(text));
        System.out.println("Word\tLength");
        for (String[] row : wordLengths)
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
    }
}
