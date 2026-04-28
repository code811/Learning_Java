public class Lesson41_overloadedConstructors {
    public static void main(String[] args) {

        // overloaded constructors = Allow a class to have multiple constructors
        //                           with different parameter lists.
        //                           Enable objects to be initialized in various ways.

        Lesson41_user user1 = new Lesson41_user("Spongebob");
        Lesson41_user user2 = new Lesson41_user("Patrick", "PStar@aol.com");
        Lesson41_user user3 = new Lesson41_user("Sandy", "SCheeks@gmail.com", 27);
        Lesson41_user user4 = new Lesson41_user();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}
