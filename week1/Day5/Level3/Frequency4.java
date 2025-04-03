package level3;
import java.util.Scanner;
public class Frequency4 {
    public static String[][] frequencyCh(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freq[c]++;
        }
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                count++;
            }
        }
        String[][] res = new String[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                res[index][0] = String.valueOf((char) i);
                res[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }
        return res;
    }
    public static void display(String[][] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " : " + result[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String[][] frequencies = frequencyCh(str);
        display(frequencies);
    }
}

