package Lesson51_runtimePolymorphism;

public class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println("The dog goes *woof*");
    }
}
