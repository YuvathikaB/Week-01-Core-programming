package level2;
import java.util.*;
public class RockPaperScissors {
    public static String computer() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[(int) (Math.random() * 3)];
    }
    public static String winner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        }
        if ((user.equals("rock") && computer.equals("scissors")) ||
                (user.equals("paper") && computer.equals("rock")) ||
                (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        }
        return "Computer";
    }
    public static String[][] statistics(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[3][3];
        stats[0][0] = "User Wins";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", (double)userWins / totalGames);
        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", (double)computerWins / totalGames);
        stats[2][0] = "Winning %";
        stats[2][1] = String.format("User: %.2f%%", (userWins * 100.0 / totalGames));
        stats[2][2] = String.format("Computer: %.2f%%", (computerWins * 100.0 / totalGames));
        return stats;
    }
    public static void display(String[][] results, String[][] stats) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t\t" + results[i][0] + "\t" + results[i][1] + "\t" + results[i][2]);
        }
        System.out.println("\nStatistics:");
        for (String[] row : stats) {
            if (row[0].equals("Winning %")) {
                System.out.println(row[0] + ": " + row[1] + ", " + row[2]);
            } else {
                System.out.println(row[0] + ": " + row[1] + " (Average: " + row[2] + ")");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();
        String[][] results = new String[games][3];
        int userWins = 0, computerWins = 0;
        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = sc.nextLine();
            String computerChoice = computer();
            String winner = winner(userChoice, computerChoice);
            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
            results[i] = new String[]{userChoice, computerChoice, winner};
        }
        display(results, statistics(userWins, computerWins, games));
    }
}

