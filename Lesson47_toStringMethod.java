public class Lesson47_toStringMethod {
    public static void main(String[] args) {

        // .toString() = Method inherited from the Object class.
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details.

        Lesson47_car car1 = new Lesson47_car("Ford", "Mustang", 2025, "Red");

//        System.out.println(car); // Prints a hash code

//        System.out.println(car.color + " " + car.year + " " + car.make + " " + car.model); // Gives meaningful detail, however verbose

        System.out.println(car1); // Now its hash code has been overridden with toString()

        Lesson47_car car2 = new Lesson47_car("Chevrolet", "Corvette", 2026, "Blue");
        System.out.println(car2);
    }

}
