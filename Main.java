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
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.")
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
            	System.out.print("Correct! The number was " to numberToGuess + ".");
                System.out.println("You guessed it in " + attempts + " tries!");
            }
        }

        scanner.close();
    }
}
