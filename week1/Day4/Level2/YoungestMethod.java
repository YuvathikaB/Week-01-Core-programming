package level2;
import java.util.*;
public class YoungestMethod {
    public static String Youngest(String[] name, int[] age) {
        int young = age[0];
        String youngestFriend = name[0];
        for (int i = 1; i < age.length; i++) {
            if (age[i] < young) {
                young = age[i];
                youngestFriend = name[i];
            }
        }
        return youngestFriend;
    }
    public static String Tallest(String[] name, double[] height) {
        double tallest = height[0];
        String tallestFriend = name[0];
        for (int i = 1; i < height.length; i++) {
            if (height[i] > tallest) {
                tallest = height[i];
                tallestFriend = name[i];
            }
        }
        return tallestFriend;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] name = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + name[i] + ": ");
            age[i] = scanner.nextInt();
            System.out.print("Enter the height (m) of " + name[i] + ": ");
            height[i] = scanner.nextDouble();
            System.out.println();
        }
        String youngestFriend = Youngest(name, age);
        String tallestFriend = Tallest(name, height);
        System.out.println();
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);
    }
}

