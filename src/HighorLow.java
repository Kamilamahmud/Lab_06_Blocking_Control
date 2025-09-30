import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // Generate random number between 1 and 10
        int randomNumber = rand.nextInt(10) + 1;

        int guess = 0;
        boolean validInput;

        // Get valid guess
        do {
            System.out.print("Guess a number between 1 and 10: ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                if (guess >= 1 && guess <= 10) {
                    validInput = true;
                } else {
                    System.out.println("Number must be between 1 and 10.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter an integer between 1 and 10.");
                scanner.next();
                validInput = false;
            }
        } while (!validInput);

        // Show result
        System.out.println("The random number was: " + randomNumber);

        if (guess < randomNumber) {
            System.out.println("Your guess was too low.");
        } else if (guess > randomNumber) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("On the money! You guessed it!");
        }

        scanner.close();
    }
}
