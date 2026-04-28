import java.util.Random;
import java.util.Scanner;

public class Lesson38_slotMachine {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    static final String[] scatterSymbols = {"🍒", "🍉", "🍋", "🛎️", "⭐️"};

    public static void main(String[] args) {
        System.out.println("Welcome to the Slot Machine!");
        System.out.println("To begin, enter an amount you wish to add into your balance!");
        double balance = getBalance();

        String playing = "yes";
        do {
            if(balance <= 0) {
                System.out.println("You've run out of money! You'll need to add more to continue playing!");
                balance = getBalance();
            }

            System.out.println("Enter an amount you wish to bet!");
            double bet = getBet(balance);

            balance = spinMachine(balance, bet);

            System.out.print("Do you want to test your luck again? (yes/no): " );
            playing = sc.nextLine().toLowerCase();
            System.out.println();
        } while (playing.equals("yes"));

        System.out.println("Thank you for playing!");
        sc.close();
    }

    static double getBalance() {
        System.out.print("Enter an amount to add into your balance: +$");
        double balance = Double.parseDouble(sc.nextLine());
        System.out.println();

        // validates user input to be positive
        while(balance <= 0) {
            System.out.println("Please enter an appropriate response!");
            System.out.print("Enter an amount to add into your balance: +$");
            balance = Double.parseDouble(sc.nextLine());
            System.out.println();
        }

        return balance;
    }

    static double getBet(double balance) {
        System.out.print("Enter bet amount: -$");
        double bet = Double.parseDouble(sc.nextLine());
        System.out.println();

        // validates user input to be positive and lower than set balance
        while(bet < 0 || bet > balance) {
            System.out.println("Please enter an appropriate response!");
            System.out.print("Enter bet amount: -$");
            bet = Double.parseDouble(sc.nextLine());
            System.out.println();
        }

        return bet;
    }

    static double spinMachine(double balance, double bet) {
        balance -= bet;
        System.out.println("Remaining Balance: $" + balance);
        System.out.println();

        String[] slotMachine = {scatterSymbols[random.nextInt(scatterSymbols.length)],
                              scatterSymbols[random.nextInt(scatterSymbols.length)],
                              scatterSymbols[random.nextInt(scatterSymbols.length)]};

        displaySlot(slotMachine);

        double payout = getPayout(slotMachine, bet);

        balance += payout;
        System.out.println("Remaining Balance: $" + balance);
        return balance;
    }

    static void displaySlot(String[] slotMachine) {
        // displays slot machine
        System.out.println("=============");
        for (String symbol : slotMachine) {
            System.out.print("| " + symbol + " ");
        }
        System.out.print("|\n");
        System.out.println("=============");
        System.out.println();
    }

    static double getPayout(String[] slotMachine, double bet) {
        // checks if symbols generated match
        int matchMultiplier = 0;
        int matchIndex = 0;
        for(int i = 0; i < (slotMachine.length - 1); i++) {

            if(slotMachine[i].equals(slotMachine[i + 1])) {
                matchMultiplier++;
                matchIndex = i;
            }
        }

        // calculates gross payout
        double payout = 0;
        if(matchMultiplier > 0) {
            switch(slotMachine[matchIndex]) {
                case "🍒" -> payout = bet * 3.0 * ((double) matchMultiplier/(slotMachine.length - 1));
                case "🍉" -> payout = bet * 4.0 * ((double) matchMultiplier/(slotMachine.length - 1));
                case "🍋" -> payout = bet * 5.0 * ((double) matchMultiplier/(slotMachine.length - 1));
                case "🛎️" -> payout = bet * 10.0 * ((double) matchMultiplier/(slotMachine.length - 1));
                case "⭐️" -> payout = bet * 20.0 * ((double) matchMultiplier/(slotMachine.length - 1));
            }
            System.out.println("Congratulations! You won +$" + (payout - bet) + "!"); // displays net earnings
        }
        else {
            System.out.println("Unfortunately, you lost -$" + bet + ".");
        }

        return payout;
    }
}