package level3;
import java.util.*;
public class Cards {
    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        return deck;
    }
    public static String[] shuffleDeck(String[] deck) {
        Random random = new Random();
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + random.nextInt(n - i);
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }
    public static String[][] distributeDeck(String[] deck, int numPlayers) {
        int numOfCards = deck.length;
        int cardsPerPlayer = numOfCards / numPlayers;
        int remainingCards = numOfCards % numPlayers;
        String[][] players = new String[numPlayers][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index];
                index++;
            }
        }
        if (remainingCards > 0) {
            System.out.println("Remaining undistributed cards: " + remainingCards);
        }
        return players;
    }
    public static void printPlayersAndCards(String[][] players) {
        if (players != null) {
            for (int i = 0; i < players.length; i++) {
                System.out.println("Player " + (i + 1) + "'s cards:");
                System.out.println(Arrays.toString(players[i]));
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        if (numPlayers <= 0) {
            System.out.println("Number of players must be greater than 0.");
            return;
        }
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        String[][] players = distributeDeck(deck, numPlayers);
        printPlayersAndCards(players);
        scanner.close();
    }
}

