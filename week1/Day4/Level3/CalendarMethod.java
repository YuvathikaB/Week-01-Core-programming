package level3;
import java.util.*;
public class CalendarMethod {
    public static String monthName(int month) {
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        return months[month - 1];
    }
    public static int daysInMonth(int month, int year) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month == 2 && leap(year)) return 29;
        return days[month - 1];
    }
    public static boolean leap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int firstDayOfMonth(int m, int y) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }
    public static void displayCalendar(int month, int year) {
        System.out.println("\n  " + monthName(month) + " " + year);
        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");
        int firstDay = firstDayOfMonth(month, year);
        int daysInMonth = daysInMonth(month, year);
        String row = "";
        for (int i = 0; i < firstDay; i++) row += "     ";
        for (int day = 1; day <= daysInMonth; day++) {
            row += String.format("%5d", day);
            if ((day + firstDay) % 7 == 0 || day == daysInMonth) {
                System.out.println(row);
                row = "";
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        displayCalendar(month, year);
    }
}

