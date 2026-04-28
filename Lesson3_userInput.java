import java.util.Scanner;

public class Lesson3_userInput {
    public static void main(String[] args) {

        // Calculate area of a rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = sc.nextDouble();

        System.out.print("Enter the height: ");
        height = sc.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area + "cm");

        sc.close();

            /*
        // COMMON ISSUES

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Leaves a newline token in the buffer
        sc.nextLine(); // Gets rid of newline token

        System.out.println("Enter your favorite color");
        String color = sc.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("You like the color " + color);
             */


            /*
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("What is your GPA?: ");
        double gpa = Double.parseDouble(sc.nextLine());
        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = Boolean.parseBoolean(sc.nextLine());

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old!");
        System.out.println("Your GPA is: " + gpa);

        if(isStudent) {
            System.out.println("You are enrolled as a student");
        }
        else {
            System.out.println("You are NOT enrolled");
        }
             */



        sc.close(); // when something is opened, typically, it should be closed once finished
    }
}
