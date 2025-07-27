import java.util.*;

public class GuessNumberGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the guessing number:");
        int numberToGuess = sc.nextInt(); // The number to guess
        int i = 0; // Initialize a counter variable

        while (i == 0) {
            System.out.print("Guess the number between 1 and 10:");
            int userGuess = sc.nextInt(); // Read user input
            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You've guessed the number." );
                break;
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Too low! Try again.");
            }
        }

        sc.close();
    }
}