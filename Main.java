import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int attempts = 0; // track how many guesses it took

        System.out.println("Guess a number between 1 and 100:");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            String line = scanner.nextLine();

            // Validate numeric input
            try {
                guess = Integer.parseInt(line.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: please enter a whole number between 1 and 100.");
                // keep the game running
                continue;
            }

            // Validate range
            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }

            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.print("Correct! The number was " + numberToGuess + ".");
                System.out.println("You guessed it in " + attempts + " tries!");
            }
        }

        scanner.close();
    }
}
