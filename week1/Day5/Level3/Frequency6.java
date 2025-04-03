package level3;
import java.util.Scanner;
public class Frequency6 {
    public static String[] frequency(String str){
        char[] chars=str.toCharArray();
        int length=chars.length;
        int[] freq=new int[length];
        for (int i=0;i<length;i++){
            freq[i]=1;
        }
        for (int i = 0; i < length; i++) {
            if (chars[i] == '0') {
                continue;
            }
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        int count = 0;
        for (char c : chars) {
            if (c != '0') {
                count++;
            }
        }
        String[] res = new String[count];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                res[idx++] = chars[i] + " - " + freq[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] frequencies = frequency(str);
        for (String freq : frequencies) {
            System.out.println(freq);
        }
    }
}

