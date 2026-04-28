package Lesson50_polymorphism;

public class Car implements Vehicle1{

    @Override
    public void go() {
        System.out.println("You drive the car");
    }
}
