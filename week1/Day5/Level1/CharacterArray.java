package level1;
import java.util.*;
public class CharacterArray {
    public static char[] Characters(String str) {
        char[] charArr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArr[i] = str.charAt(i);
        }
        return charArr;
    }
    public static boolean compare(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        char[] userDefined = Characters(input);
        char[] builtIn = input.toCharArray();
        System.out.print("User-defined method : ");
        for (char ch : userDefined) {
            System.out.print(ch + " ");
        }
        System.out.print("\nBuilt-in toCharArray() method : ");
        for (char ch : builtIn) {
            System.out.print(ch + " ");
        }
        boolean isEqual = compare(userDefined, builtIn);
        System.out.println();
        System.out.println(isEqual? "Same" : "Different");
        scanner.close();
    }
}

