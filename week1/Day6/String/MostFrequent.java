package Extra;
import java.util.Scanner;
public class MostFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        char mostFrequent = str.charAt(0);
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > max) {
                mostFrequent = ch;
                max = freq[ch];
            }
        }
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
