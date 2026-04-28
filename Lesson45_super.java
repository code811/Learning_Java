public class Lesson45_super {
    public static void main(String[] args) {
        //                                      child   <-   parent
        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes

        Lesson45_person person = new Lesson45_person("Tom", "Riddle");
        Lesson45_student student = new Lesson45_student("Harry", "Potter", 3.25);
        Lesson45_employee employee = new Lesson45_employee("Rubeus", "Hagrid", 50000);

        System.out.println(student.gpa);

        student.showGPA();

        person.showName();

        employee.showSalary();
    }
}
