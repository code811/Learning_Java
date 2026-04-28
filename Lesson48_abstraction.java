public class Lesson48_abstraction {
    public static void main(String[] args) {

        // abstract = Used to define abstract classes and methods.
        //            Abstraction is the process of hiding implementation details
        //            and showing only the essential features;
        //            Abstract classes CAN'T be instantiated directly
        //            Can contain 'abstract' methods (which must be implemented) // must be implemented by its children
        //            Can contain 'concrete' methods (where are inherited)

//        Lesson48_shape shape = new Lesson48_shape(); // Cannot create shape as it's abstract
        Lesson48_circle circle = new Lesson48_circle(3);
        Lesson48_triangle triangle = new Lesson48_triangle(4, 5);
        Lesson48_rectangle rectangle = new Lesson48_rectangle(6, 7);

        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
