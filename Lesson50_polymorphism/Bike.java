package Lesson50_polymorphism;

public class Bike implements Vehicle1 {

    @Override
    public void go() {
        System.out.println("You ride the bike");
    }
}
