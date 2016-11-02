import java.util.*;

/**
 * Plays a guessing game with the computer
 *
 * @author Thomas Kent
 * @since 01 November 2016
 */
public class Guess {
    public static Random rand = new Random();
    public static Scanner console = new Scanner(System.in);

    public static int maxGuess = 100;

    /**
     * program entry point
     * @param args command line args
     */
    public static void main(String[] args) {
        try {
            computerIntro();

            do {
                gameLoop();
                System.out.println("Would you like to continue? ('Yes' to continue, any to exit)");
                /**
                 * using .nextLine instead of .next in case someone enters a string with spaces.
                 * The characters after the space are held in the stream until future calls to .next, and then the program is a word behind reading any futher user input.
                 * .readline reads everything, including spaces, and this program only uses the first character anyway.
                 */
            } while (console.nextLine().substring(0, 1).equalsIgnoreCase("y"));
        } catch (Exception ex) {
            // eat exception
        } finally {
            System.out.println("Thank you for playing!");
        }
    }

    /**
     * introduces the game
     * @required
     */
    public static void computerIntro() {
        // give instructions on how to play
        System.out.println("You will be playing a guessing game with the computer.\n" +
                           "You will think of a number in your head between 1 and " + maxGuess +
                           ".\nWhen you are ready, the computer will begin to guess your number.\n" +
                           "After each guess, you will indicate to the computer whether it has guessed too high, too low, or correctly, by responding in this way:\n\n" +
                           "'H': computer has guessed higher than your number\n" +
                           "'L': computer has guessed lower than your number\n" +
                           "'C': computer has guessed correctly\n\n" +
                           "Press any key to begin.");
        console.nextLine();
    }

    /**
     * one iteration of the primary game loop
     * @required
     */
    public static void gameLoop() {
        System.out.println("\n\nThink of a number between 1 and " + maxGuess);
        int rangeHigh = maxGuess;
        int rangeLow = 1;

        // main loop is infinite, until the return statement is reached when the computer guesses correctly
        while (true) {
            int thisGuess = randRange(rangeLow, rangeHigh);

            System.out.println("My guess: " + thisGuess);

            Boolean validResponse = true;

            // inner loop for each guess made by the computer. continues to the next guess only when the user responds appropriately to the current guess.
            do {
                validResponse = true;
                String wat = console.nextLine();
                if (wat.length() == 0) {
                    wat = "X"; // defaults to invalid if the user chooses not to enter input
                }

                // narrows the guess range based on user feedback, or prompts for better input if user enters something invalid
                if (wat.equalsIgnoreCase("h")) {
                    rangeHigh = thisGuess;
                } else if (wat.equalsIgnoreCase("l")) {
                    rangeLow = thisGuess;
                } else if (wat.equalsIgnoreCase("c")) {
                    return;
                } else {
                    System.out.println("invalid response. Enter H, L, or C to continue.");
                    validResponse = false;
                }
            } while (!validResponse);
        }
    }

    /**
     * Generates a random number within a given range
     * @param   {int} low low end of the range of numbers
     * @param   {int} high High end of the range of numbers
     * @return  {int} random number between high and low
     */
    public static int randRange(int low, int high) {
        int range = high - low;
        return rand.nextInt(range) + low;
    }
}
