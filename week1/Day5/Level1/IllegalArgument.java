package level1;
import java.util.*;
public class IllegalArgument {
    public static String generate(String str,int start,int end) {
        return str.substring(start, end);
    }
    public static void handle(String str,int start,int end) {
        try {
            System.out.println(str.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException : " + e.getMessage());
        } catch (RuntimeException e){
            System.out.println("Caught a RuntimeException : " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.print("Enter start index(greater than end index) : ");
        int start = sc.nextInt();
        System.out.print("Enter end index : ");
        int end = sc.nextInt();
        //generate(str,start,end);
        handle(str,start,end);
    }
}
