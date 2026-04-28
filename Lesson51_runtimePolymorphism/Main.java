package Lesson51_runtimePolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Runtime polymorphism = When the method that gets executed is decided
        //                        at runtime based on the actual type of the object.

        Scanner sc = new Scanner(System.in);

//        Animal animal = new Animal(); // Abstract classes cannot be instantiated
        // Based on user input, this will either be
//        Animal animal = new Dog();
//        Animal animal = new Cat();
        Animal animal;

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = Integer.parseInt(sc.nextLine());

        // The compiler does not know which .speak() will be used, it's decided at runtime
        if(choice == 1) {
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2) {
            animal = new Cat();
            animal.speak();
        }
    }
}
