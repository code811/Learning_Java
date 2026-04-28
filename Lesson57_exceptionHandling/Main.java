package Lesson57_exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exception = An event that interrupts the normal flow of a program
        //             (Dividing by zero, file not found, mismatch input type)
        //             Surround any dangerous code with a try{} block
        //             try{}, catch{}, finally{}

//        Scanner sc = new Scanner(System.in);

//        try {
//            System.out.println(1 / 0); // Causes an Arithmetic Exception
//        } // A try block must be followed by a catch block
//        catch(ArithmeticException e) {
//            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
//        }

        // Instead of placing scanner outside the try block, it can be accepted as a resource for try{} and is automatically closed at the end of try{] execution
        //      This is a try-with-resources Statement
        try(Scanner sc = new Scanner(System.in);){ // Anytime user input is accepted, it can be considered dangerous
            System.out.print("Enter a number: " );
            int number = Integer.parseInt(sc.nextLine());
            System.out.println(number);
        }
        catch(InputMismatchException e) {
            System.out.println("That wasn't a number!");
        }
        catch(Exception e) { // The Catch-all exception (Safety net)
            System.out.println("Something went wrong!"); // It's better to specifically identify what went wrong through specific exceptions
        }
        finally { // Optional; executes regardless of exception or not (Commonly used in cleanup)
//            sc.close();
            System.out.println("This always executes");
        }
    }
}
