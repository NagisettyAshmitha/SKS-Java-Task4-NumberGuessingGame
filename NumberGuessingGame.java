import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int playAgain;

        do {

            int secretNumber = random.nextInt(100) + 1;
            int guess;
            int attempts = 0;

            System.out.println("\n🎯 Guess a number between 1 and 100");

            do {

                System.out.print("Enter your guess: ");
                guess = sc.nextInt();

                attempts++;

                if (guess > secretNumber) {
                    System.out.println("📈 Too High!");
                }

                else if (guess < secretNumber) {
                    System.out.println("📉 Too Low!");
                }

                else {
                    System.out.println("🎉 Correct!");
                    System.out.println("Attempts: " + attempts);
                }

            } while (guess != secretNumber);

            System.out.print("Play Again? (1=Yes, 0=No): ");
            playAgain = sc.nextInt();

        } while (playAgain == 1);

        System.out.println("👋 Thanks for Playing!");

        sc.close();
    }
}