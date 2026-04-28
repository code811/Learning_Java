public class Lesson48_circle extends Lesson48_shape {

    double radius;

    Lesson48_circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() { // Children classes must define the method
        return Math.PI * radius * radius;
    }
}
