public class Lesson46_fish extends Lesson46_animal {

    @Override // Annotating is good practice, and provides usage: will notify if method is overriding a parent's method
    void move() { // Same named methods from a parent class in child, results in the child method having precedence
        System.out.println("This animal is swimming.");
    }
}
