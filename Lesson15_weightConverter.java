import java.util.Scanner;

public class Lesson15_weightConverter {
    public static void main(String[] args) {

        // WEIGHT CONVERSION PROGRAM

        // Declare variables
        Scanner sc = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Weight Conversion Program (W.C.P)!");
        System.out.println("To get started, please select an option!");
        System.out.println("----------------------------------------------------");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");
        // Prompt for user choice
        System.out.print("Select your option: ");
        int choice = Integer.parseInt(sc.nextLine());

        switch(choice) {
            // Option 1 convert lbs to kgs
            case 1: {
                System.out.print("Enter your weight in lbs: ");
                double weight = Double.parseDouble(sc.nextLine());
                double newWeight = weight * 0.453592;
                System.out.printf("The new weight in kgs is: %.2f", newWeight);

                break;
            }
            // Option 2 convert kgs to lbs
            case 2: {
                System.out.print("Enter your weight in kgs: ");
                double weight = Double.parseDouble(sc.nextLine());
                double newWeight = weight * 2.20462;
                System.out.printf("The new weight in lbs is: %.2f", newWeight);

                break;
            }
            // Else print not a valid choice
            default: {
                System.out.println("Not a valid choice!");
            }
        }

        sc.close();
    }
}
