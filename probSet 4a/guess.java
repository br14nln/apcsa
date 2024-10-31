
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        int number = (int) (Math.random()*100);
        int guessCount = 0;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        while (guess != number) {
            System.out.print("Your guess: ");
       
            guess = scanner.nextInt();
            guessCount++;

                // Check if the guess is too low, too high, or correct
            if (guess < number) {
                System.out.println("Nope, that guess is too low.");
            } else if (guess > number) {
                    System.out.println("Nope, that guess is too high.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + guessCount + " guesses.");
            }
           
        }
    }
}
