package Lesson54_composition;

public class Car {

    String model;
    int year;
    Engine engine;

    public Car(String model, int year, String engineType) { // The parameter is specified here as "type" would imply the Car's type, and not Engine
        this.model = model;
        this.year = year;
        engine = new Engine(engineType);
    }

    public void start() {
        this.engine.start();
        System.out.println("The " + this.model + " is running");
    }
}
