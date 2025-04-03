package level2;
import java.util.*;
public class Split {
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
    public static String[] split(String text) {
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
    public static boolean compare(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] userSplit = split(text);
        String[] builtInSplit = text.split(" ");
        System.out.println("User defined split: " + Arrays.toString(userSplit));
        System.out.println("Built-in split: " + Arrays.toString(builtInSplit));
        System.out.println("Results match: " + compare(userSplit, builtInSplit));
    }
}


