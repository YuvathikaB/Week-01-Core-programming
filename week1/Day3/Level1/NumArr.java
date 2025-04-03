import java.util.Scanner;
public class NumArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is Positive and Even.");
                } else {
                    System.out.println(arr[i] + " is Positive and Odd.");
                }
            } else if (arr[i] < 0) {
                System.out.println(arr[i] + " is Negative.");
            } else {
                System.out.println(arr[i] + " is Zero.");
            }
        }
        if (arr[0] > arr[4]) {
            System.out.println("The first element is greater than the last element.");
        } else if (arr[0] < arr[4]) {
            System.out.println("The first element is less than the last element.");
        } else {
            System.out.println("The first and the last elements are equal.");
        }
        input.close();
    }
}