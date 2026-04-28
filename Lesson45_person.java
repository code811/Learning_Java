public class Lesson45_person {

    String first;
    String last;

    Lesson45_person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    void showName() {
        System.out.println(this.first + " " + this.last);
    }
}
