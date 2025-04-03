package level1;
import java.util.*;
public class NumberFormat {
    public static void generate(String str) {
        int number = Integer.parseInt(str);
        System.out.println("Integer: " + number);
    }
    public static void handle(String str) {
        try {
            generate(str);
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException : " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        //generate(str);
        handle(str);
    }
}

