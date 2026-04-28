package Lesson50_polymorphism;

public class Boat implements Vehicle1 {

    @Override
    public void go() {
        System.out.println("You sail the boat");
    }
}
