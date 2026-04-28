package Lesson52_gettersAndSetters;

public class Car {

    private String model;
    private String color;
    private int price;

    Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public String getPrice() { // You're able to add additional logic to your GETTERS and SETTERS
        return "$" + this.price;
    }
}
