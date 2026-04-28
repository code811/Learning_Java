public class Lesson46_methodOverriding {
    public static void main(String[] args) {
        // Method overriding = When a subclass provides its own
        //                     implementation of a method that is already defined.
        //                     Allows for code reusability and give specific implementations.

        Lesson46_dog dog = new Lesson46_dog();
        Lesson46_cat cat = new Lesson46_cat();
        Lesson46_fish fish = new Lesson46_fish();

        dog.move();
        cat.move();
        fish.move();
    }
}
