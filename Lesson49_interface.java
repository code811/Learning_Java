public class Lesson49_interface {
    public static void main(String[] args) {

        // Interface = A blueprint for a class that specifies a set of abstract methods
        //             that implementing classes MUST define.
        //             Supports multiple inheritance-like behavior.

        Lesson49_rabbit rabbit = new Lesson49_rabbit();
        rabbit.flee();

        Lesson49_hawk hawk = new Lesson49_hawk();
        hawk.hunt();

//        hawk.flee();
//        rabbit.hunt();    // The respective objects cannot use the other class specific methods

        Lesson49_fish fish = new Lesson49_fish(); // Can "inherit" multiple "blueprints
        fish.flee();
        fish.hunt();
    }
}
