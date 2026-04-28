public class Lesson41_user {

    String username;
    String email;
    int age;

    Lesson41_user() {
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }

    Lesson41_user(String username) {
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }

    Lesson41_user(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    Lesson41_user(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
