package level2;
import java.util.*;
public class ShortLong {
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
        String[] words = new String[spaceCount + 1];
        int start = 0;
        for (int i = 0; i <= spaceCount; i++) {
            words[i] = text.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }
        return words;
    }
    public static String[][] wordLengths(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(stringLength(words[i]));
        }
        return res;
    }
    public static String[] shortestLongest(String[][] wordLength) {
        String shortest = wordLength[0][0];
        String longest = wordLength[0][0];
        int min = Integer.parseInt(wordLength[0][1]);
        int max = Integer.parseInt(wordLength[0][1]);
        for (int i = 1; i < wordLength.length; i++) {
            int length = Integer.parseInt(wordLength[i][1]);
            if (length < min) {
                min = length;
                shortest = wordLength[i][0];
            }
            if (length > max) {
                max = length;
                longest = wordLength[i][0];
            }
        }
        return new String[]{shortest, longest};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[][] wordLength = wordLengths(splitText(text));
        String[] shortLong = shortestLongest(wordLength);
        System.out.println("Shortest word: " + shortLong[0]);
        System.out.println("Longest word: " + shortLong[1]);
    }
}

