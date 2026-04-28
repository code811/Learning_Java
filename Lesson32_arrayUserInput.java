import java.util.Scanner;

public class Lesson32_arrayUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] foods;

        System.out.print("What number of food do you want?: ");
        int size = Integer.parseInt(sc.nextLine());

        foods = new String[size];

        for(int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = sc.nextLine();
        }

        for(String food : foods) {
            System.out.println(food);
        }

        sc.close();
    }
}
