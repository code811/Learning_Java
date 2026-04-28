public class Lesson43_static {
    public static void main(String[] args) {

        // static = Makes a variable or method belong to the class
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared resources.

        Lesson43_friend friend1 = new Lesson43_friend("Spongebob");
        Lesson43_friend friend2 = new Lesson43_friend("Patrick");
        Lesson43_friend friend3 = new Lesson43_friend("Squidward");
        Lesson43_friend friend4 = new Lesson43_friend("Sandy");

//        System.out.println(friend1.numOfFriends);
//        System.out.println(friend2.numOfFriends);
//        System.out.println(friend3.numOfFriends); // better for clarity to use class instead of objects when using static

        System.out.println(Lesson43_friend.numOfFriends); // indicates numOfFriends is static (shared) and not an individual copy for each object
        Lesson43_friend.showFriends();

        Math.round(3.99); // .round() is a static method, and acts as utility (operation)
                          // there's no reason to create an individual object to use this method,
                          // if .round() were not a static method, it would require creating an object which creates a copy of the method before use
                          // this is inconvenient as the operation .round() will perform the same operation if it's present in one object or another, so why not both objects share that constant operation?
                          // the operation does not depend on per instance attributions (each individual object's values) to perform calculations
    }
}
