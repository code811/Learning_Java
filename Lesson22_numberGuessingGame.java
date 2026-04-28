import java.util.Random;
import java.util.Scanner;

public class Lesson22_numberGuessingGame {
    public static void main(String[] args) {

        //NUMBER GUESSING GAME

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;          // inclusive exclusive
        int randomNumber = random.nextInt(min, max);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n: ", min, max);

        do {
            System.out.print("Enter a guess: ");
            guess = Integer.parseInt(sc.nextLine());
            attempts++;

            if(guess > randomNumber) {
                System.out.println("Number too high!");
            }
            else if(guess < randomNumber) {
                System.out.println("Number too low!");
            }
            else {
                System.out.println("Correct! The number was " + randomNumber);
                System.out.println("The number of attempts: " + attempts);
            }

        }while(guess != randomNumber);

        System.out.println("You have won!");
        sc.close();
    }
}
