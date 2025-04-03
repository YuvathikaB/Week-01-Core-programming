package Extra;
import java.util.Scanner;
public class Remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char charRemove = sc.next().charAt(0);
        String newString = str.replaceAll(String.valueOf(charRemove), "");
        System.out.println("Modified String: " + newString);
    }
}
