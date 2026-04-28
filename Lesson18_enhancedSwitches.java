import java.util.Scanner;

public class Lesson18_enhancedSwitches {
    public static void main(String[] args) {
        // Enhanced switch = A replacement to many else if statements
        //                   (Java14 feature)

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = sc.nextLine();

        switch(day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> {
                System.out.println("It is a weekday!");
            }
            case "Saturday", "Sunday" -> {
                System.out.println("It is a weekend!");
            }
            default -> {
                System.out.println(day + " is not a day");
            }
        }

    }
}
