public class Lesson40_constructors {
    public static void main(String[] args) {
        // constructor = A special method to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values

        Lesson40_student student1 = new Lesson40_student("Spongebob", 30, 3.2);
        Lesson40_student student2 = new Lesson40_student("Patrick", 34, 1.5);
        Lesson40_student student3 = new Lesson40_student("Sandy", 27, 4.0);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student1.study();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student2.study();

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        student3.study();
    }
}
