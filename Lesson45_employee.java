public class Lesson45_employee extends Lesson45_person {

    int salary;

    Lesson45_employee(String first, String last, int salary) {
        super(first, last);
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(this.first + "'s salary is $" + this.salary);
    }
}
