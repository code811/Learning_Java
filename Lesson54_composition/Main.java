package Lesson54_composition;

public class Main {
    public static void main(String[] args) {

        // Composition = Represents a "part-of" relationship between objects.
        //               For example, an Engine is "part of" a Car.
        //               Allows complex objects to be constructed from smaller objects.

        Car car = new Car("Corvette", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();

        // The difference with composition from aggregation, is that if Car is deleted, then the Engine is deleted as well
        // The Car and Engine classes are closely coupled
    }
}
