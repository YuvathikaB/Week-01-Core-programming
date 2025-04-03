package Extra;
import java.util.Scanner;
public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter the word to replace: ");
        String replace = sc.nextLine();
        System.out.print("Enter the word to replace with: ");
        String replaceWith = sc.nextLine();
        String res = replaceWord(sentence, replace, replaceWith);
        System.out.println("Modified Sentence: " + res);
        sc.close();
    }
    public static String replaceWord(String sentence, String wordToReplace, String wordToReplaceWith) {
        return sentence.replaceAll("\\b" + wordToReplace + "\\b", wordToReplaceWith);
    }
}
