import java.util.Scanner;

public class Lesson7_ifStatements {
    public static void main(String[] args) {

        // if statement = performs a block of code is its condition is true

        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = Integer.parseInt(sc.nextLine());

        System.out.print("Are you a student (true/false): ");
        isStudent = Boolean.parseBoolean(sc.nextLine());

        // GROUP 1
        if(name.isEmpty()) { // checks if string variable is empty and returns true/false
            System.out.println("You didn't enter your name! ");
        }
        else {
            System.out.println("Hello " + name + '!');
        }

        // GROUP 2
        if(age >= 18) {
            System.out.println("You are an adult!");
        }
        else if(age >= 65) { // if-statements are checked top-down, meaning the first statement that is true will run and end the if-structure
            System.out.println("You are a senior!");
        }
        else if(age < 0) {
            System.out.println("You haven't been born yet!");
        }
        else if(age == 0) {
            System.out.println("You are a baby!");
        }
        else {
            System.out.println("You are a child!");
        }

        // GROUP 3

        if(isStudent) {
            System.out.println("You are a student!");
        }
        else {
            System.out.println("You are NOT a student!");
        }

        sc.close();
    }
}
