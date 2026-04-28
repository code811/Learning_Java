package Lesson50_polymorphism;

public class Main {
    public static void main(String[] args) {

        // Polymorphism = "POLY" = "MANY"
        //                "MORPH" = "SHAPE"
        //                Objects can identify as other objects.
        //                Objects can be treated as objects of a common superclass.

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

//        Car[] cars = {car, bike, boat}; // bikes and boats don't identify as cars, only car does
//        Bike[] bikes = {car, bike, boat};
//        Boat[] boats = {car, bike, boat};
//        Vehicle[] vehicles = {car, bike, boat}; // They all identify as themselves, but also their parent class, vehicle
//
//        for(Vehicle vehicle : vehicles) { //
//            vehicle.go(); // Same method called, different results output
//        }

        Vehicle1[] vehicles = {car, bike, boat}; // Polymorphism can be done through interfaces as well

        for(Vehicle1 vehicle : vehicles) {
            vehicle.go();
        }
    }
}
