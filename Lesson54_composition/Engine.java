package Lesson54_composition;

public class Engine {

    String type;

    public Engine(String type) { // Can be different, as the Class name represents what that "type" is, reducing verbosity and redundancy
        this.type = type;
    }

    public void start() {
        System.out.println("You start the " + this.type + " engine");
    }
}
