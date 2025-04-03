package level1;
import java.util.Scanner;
public class ArrayIndexOutOfBounds {
    public static void generate(String[] arr){
        System.out.println(arr[arr.length]);
    }
    public static void handle(String[] arr) {
        try {
            generate(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException : " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        String[] names =new String[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter element "+(i+1)+" : ");
            names[i]=sc.next();
        }
        //generate(arr);
        handle(names);
    }
}
