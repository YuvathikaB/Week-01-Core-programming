package DateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = sc.nextLine();
        LocalDate date = LocalDate.parse(inputDate, formatter);
        date = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("New date: " + date.format(formatter));
    }
}
