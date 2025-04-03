import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year greater than or equal to 1582: ");
        int year = input.nextInt();
        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is a Leap Year.");
            }
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("Using single if condition: " + year + " is a Leap Year.");
            } else {
                System.out.println("Using single if condition: " + year + " is a Leap Year.");
            }
        } else {
            System.out.println("Enter a year greater than or equal to 1582.");
        }
    }
}