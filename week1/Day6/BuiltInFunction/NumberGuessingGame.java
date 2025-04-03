package Problems;
import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lower = 1;
        int upper = 100;
        String feedback;
        System.out.println("Think of a number between " + lower + " and " + upper);
        while (true) {
            int guess = generate(lower, upper);
            System.out.println("Is your number " + guess + "? (Enter 'high' if it's high, 'low' if it's low, or 'correct' if it's right.)");
            feedback = getUserFeedback(sc);
            if (feedback.equals("correct")) {
                System.out.println("Guessed your number!");
                break;
            } else if (feedback.equals("high")) {
                upper = guess - 1;
            } else if (feedback.equals("low")) {
                lower = guess + 1;
            } else {
                System.out.println("Please enter 'high', 'low', or 'correct'.");
            }
        }
    }
    public static int generate(int lowerBound, int upperBound) {
        Random rand = new Random();
        return rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
    public static String getUserFeedback(Scanner scanner) {
        return scanner.nextLine().toLowerCase();
    }
}
