package level1;
import java.util.Scanner;
public class IndexOutOfBounds {
    public static void generate(String str) {
        System.out.println(str.charAt(str.length()));
    }
    public static void handle(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught a StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        // generate(str);
        handle(str);
    }
}