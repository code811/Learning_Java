import java.util.Random;
import java.util.Scanner;

public class Lesson30_diceRollerProgram {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Welcome to the Dice Roller Program!");
        System.out.println("------------------------------------");
        int numOfDice = getNumOfDice();
        int total = getTotal(numOfDice);

        System.out.println("The total is: " + total);
        System.out.println("End of Program!");

        sc.close();
    }

    static int getNumOfDice() {
        System.out.print("Enter a number of dice you want to roll: ");
        int numOfDice = Integer.parseInt(sc.nextLine());

        while(numOfDice < 0) {
            System.out.println("Enter an appropriate number of dice you want to roll: ");
            numOfDice = Integer.parseInt(sc.nextLine());
        }

        return numOfDice;
    }

    static int getTotal(int numOfDice) {
        int total = 0;
        for(int i = 0; i < numOfDice; i++) {
            int dice = random.nextInt(1, 6 + 1);
            total += dice;

            displayDice(dice);
        }

        return total;
    }

    static void displayDice(int dice) {
        System.out.println();
        switch(dice) {
            case 1: {
                System.out.println(
                        "---------\n" +
                        "|       |\n" +
                        "|   o   |\n" +
                        "|       |\n" +
                        "---------");
                break;
            }
            case 2: {
                System.out.println(
                        "---------\n" +
                        "| o     |\n" +
                        "|       |\n" +
                        "|     o |\n" +
                        "---------");
                break;
            }
            case 3: {
                System.out.println(
                        "---------\n" +
                        "| o     |\n" +
                        "|   o   |\n" +
                        "|     o |\n" +
                        "---------");
                break;
            }
            case 4: {
                System.out.println(
                        "---------\n" +
                        "| o   o |\n" +
                        "|       |\n" +
                        "| o   o |\n" +
                        "---------");
                break;
            }
            case 5: {
                System.out.println(
                        "---------\n" +
                        "| o   o |\n" +
                        "|   o   |\n" +
                        "| o   o |\n" +
                        "---------");
                break;
            }
            case 6: {
                System.out.println(
                        "---------\n" +
                        "| o   o |\n" +
                        "| o   o |\n" +
                        "| o   o |\n" +
                        "---------");
                break;
            }
        }
        System.out.println();
        System.out.println("*******************");
        System.out.println();
    }
}
