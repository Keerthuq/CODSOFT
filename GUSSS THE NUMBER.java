import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int roundsPlayed = 0;
        int roundsWon = 0;

        System.out.println("Welcome to Guess the Number!");

        boolean playAgain = true;
        while (playAgain) {
            int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nI've chosen a number between " + minRange + " and " + maxRange + ". Can you guess it?");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the number " + numberToGuess + " correctly in " + attempts + " attempts!");
                    guessedCorrectly = true;
                    roundsWon++;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low! Try a higher number.");
                } else {
                    System.out.println("Too high! Try a lower number.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The number I picked was " + numberToGuess + ".");
            }

            roundsPlayed++;

            System.out.println("\nRounds played: " + roundsPlayed + ", Rounds won: " + roundsWon);

            System.out.print("\nDo you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes") || playAgainInput.equals("y");
        }

       
    }
}
