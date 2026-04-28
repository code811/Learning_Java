public class Lesson48_rectangle extends Lesson48_shape{

    double length;
    double width;

    Lesson48_rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
