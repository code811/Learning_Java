public class Lesson45_student extends Lesson45_person {

    double gpa;

    Lesson45_student(String first, String last, double gpa) {
//        this.first = first; // Because "Student" is a child of "Person", and constructing a "Person" class requires a first and last parameter
//        this.last = last; // These variables need to be passed into the parent constructor
        super(first, last); // Can be thought of as -> Lesson45_person(first, last)

        this.gpa = gpa;
    }

    void showGPA() {
        System.out.println(this.first + "'s GPA is: " + this.gpa);
    }
}
