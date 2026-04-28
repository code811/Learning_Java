public class Lesson43_friend {

//    int numOfFriends; // each "Friend" object has a copy of each non-static field and method
    static int numOfFriends; // All objects of "Friend" class "share" this variable
    String name;

    Lesson43_friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    static void showFriends() {
        System.out.println("You have " + numOfFriends + " total friends"); // this. cannot be used with static fields as this. refers to instances
                                                                           // static refers to the class, so ClassName.staticVariableName is professionally used
    }
}
