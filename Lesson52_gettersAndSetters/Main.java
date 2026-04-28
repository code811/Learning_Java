package Lesson52_gettersAndSetters;

public class Main {
    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        Car car = new Car("Charger", "Yellow", 10000);

//        car.model = "Corvette"; // Because the fields are public, they're easily immutable

//        System.out.println(car.color + " " + car.model + " " + car.price); // With private access modifiers, it prevents easy accessibility to the fields

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    }
}
