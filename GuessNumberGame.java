import java.util.Random;
import java.util.Scanner;
public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean playAgain;
        do {
            int numberToGuess = random.nextInt(100) + 1;
            int numberOfAttempts = 5;
            boolean hasGuessedCorrectly = false;
            System.out.println("Guess a number between 1 and 100. You have " + numberOfAttempts + " attempts.");
            for (int i = 0; i < numberOfAttempts; i++) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    score++;
                    hasGuessedCorrectly = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
                System.out.println("Attempts left: " + (numberOfAttempts - i - 1));
            }
            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + numberToGuess);
            }
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        } while (playAgain);
        System.out.println("Game over! Your score is: " + score);
        scanner.close();
    }
}
