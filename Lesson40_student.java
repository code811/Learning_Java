import javax.swing.text.html.parser.TagElement;

public class Lesson40_student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // Constructor
    Lesson40_student(String name, int age, double gpa) {
        this.name = name; // this. refers to the class' attributes during situations with conflicting names
        this.age = age;
        this.gpa = gpa;
        isEnrolled = true; // this. not needed as there is no name conflict
    }

    void study() {
        System.out.println(name + " is studying");
    }
}
