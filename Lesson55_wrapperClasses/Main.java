package Lesson55_wrapperClasses;

public class Main {
    public static void main(String[] args) {

        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of Collections Framework and static Utility Methods.

//        int a = 123;
        // Good visualization of Wrapping
//        Integer a = new Integer(123);
//        Double b = new Double(3.14);
//        Character c = new Character('$');
//        Boolean d = new Boolean(true);

        // Modern Approach to using Wrapper Classes (Autoboxing)
//        Integer a = 123;
//        Double b = 3.14;
//        Character c = '$';
//        Boolean d = true;
//        String e = "Pizza"; // Similar to how Strings are created (Reference data type)

        // Unboxing
//        int w = a;
//        double x = b;
//        char y = c;
//        boolean z = d;

        // Use of static utility methods

        // Turns primitive data into Strings through wrapper class methods
//        String a = Integer.toString(123);
//        String b = Double.toString(3.14);
//        String c = Character.toString('@');
//        String d = Boolean.toString(false);
//
//        String x = a + b + c + d;
//
//        System.out.println(x);

        // Turns strings into primitive data type through wrapper class methods
//        int a = Integer.parseInt("123");
//        double b = Double.parseDouble("3.14");
//        char c = "Pizza".charAt(0); // Strings have built in methods; unrelated to wrapper classes
//        boolean d = Boolean.parseBoolean("true");

//        String x = a + b + c + d; // This would mix and match different data types

        // Uses Character wrapper class methods
        char letter = 'b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
    }
}
