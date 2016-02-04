import java.util.Scanner;

/**
 * Created by willhorton on 1/14/16.
 */
public class TooLargeTooSmall {

    public static void main(String[] args) {

        int magicNum = 1 + (int)(Math.random() * 10);
        int input = 0;
        int numOfGuesses = 5;
        int previousGuess = 0;

        Scanner sc = new Scanner(System.in);

        while(numOfGuesses >= 0) {

            System.out.println("Try to guess the magic number between 1 and 10: ");
            input = sc.nextInt();

            if (input == magicNum) {
                System.out.println("Congrats, you guessed the number.");
                return;
            } else if (input == previousGuess) {
                System.out.println("You entered "+ input + " twice. You have " + numOfGuesses + " remaining.");
            } else if (input > magicNum) {
                System.out.println("Your guess was too high, you have " + --numOfGuesses + " remaining.");
            } else if (input < magicNum) {
                System.out.println("Your guess was too low, you have " + --numOfGuesses + " remaining.");
            }

            previousGuess = input;

        }

        System.out.println("You used all your guesses. Better luck next time.");

    }

}