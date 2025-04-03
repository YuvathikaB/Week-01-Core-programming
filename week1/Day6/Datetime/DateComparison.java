package DateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.print("Enter the 1st date (yyyy-MM-dd): ");
        String inputDate1 = sc.nextLine();
        System.out.print("Enter the 2nd date (yyyy-MM-dd): ");
        String inputDate2 = sc.nextLine();
        LocalDate date1 = LocalDate.parse(inputDate1, format);
        LocalDate date2 = LocalDate.parse(inputDate2, format);
        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("The first date is the same as the second date.");
        }
    }
}
