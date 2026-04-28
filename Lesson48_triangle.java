public class Lesson48_triangle extends Lesson48_shape{

    double base;
    double height;

    Lesson48_triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}
