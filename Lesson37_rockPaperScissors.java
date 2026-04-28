import java.util.Scanner;
import java.util.Random;

public class Lesson37_rockPaperScissors {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    static final String[] CHOICES = {"rock", "paper", "scissors"}; // game state

    public static void main(String[] args) {
        String playAgain = "yes";
        do {
            String playerChoice = getPlayerChoice();
            String computerChoice = CHOICES[random.nextInt(3)];
            displayWinner(playerChoice, computerChoice);
            System.out.print("Do you want to play again?: ");
            playAgain = sc.nextLine().toLowerCase();
            System.out.println();
        } while(playAgain.equals("yes"));

        System.out.println("Thank you for playing!");
        sc.close();
    }

    static String getPlayerChoice() {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Ready?");
        System.out.println("ROCK!\n" +
                "PAPER!\n" +
                "SCISSORS!\n" +
                "SHOOT!\n");
        System.out.print("Rock, Paper, or Scissors?: ");
        String playerChoice = sc.nextLine().toLowerCase();

        while(!playerChoice.equals("rock") &&
                !playerChoice.equals("paper") &&
                !playerChoice.equals("scissors")) {
            System.out.println("Choose an appropriate response!");
            System.out.println("ROCK!\n" +
                    "PAPER!\n" +
                    "SCISSORS!\n" +
                    "SHOOT!\n");
            System.out.print("Rock, Paper, or Scissors?: ");
            playerChoice = sc.nextLine().toLowerCase();
        }

        return playerChoice;
    }

    static void displayWinner(String playerChoice, String computerChoice) {
        System.out.println("The computer has chosen: " + computerChoice + "!");

        if(playerChoice.equals(computerChoice)) {
            System.out.println("YOU TIED!");
            return;
        }

        switch(playerChoice) {
            case "rock" -> System.out.println(computerChoice.equals("scissors") ? "YOU WIN!" : "YOU LOSE!");
            case "paper" -> System.out.println(computerChoice.equals("rock") ? "YOU WIN!" : "YOU LOSE!");
            case "scissors" -> System.out.println(computerChoice.equals("paper") ? "YOU WIN!" : "YOU LOSE!");
        }
    }
}