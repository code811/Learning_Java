public abstract class Lesson48_shape {

    abstract double area(); // ABSTRACT (helps create consistency between children, children MUST override this method)

    void display() { // CONCRETE (Inherited, passed down to children)
        System.out.println("This is a shape.");
    }
}
