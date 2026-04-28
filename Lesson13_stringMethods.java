public class Lesson13_stringMethods {
    public static void main(String[] args) {

        String name = "Carson Nghiem";

        int length = name.length(); // returns the number of characters in a string
        char letter = name.charAt(0); // returns the character at the given index
        int index = name.indexOf("o"); // returns the first index of the specified character's first appearance
        int lastIndex = name.lastIndexOf("o"); //returns the last index of the specified character

//        name = name.toUpperCase(); // Capitalizes all characters in the string
//        name = name.toLowerCase(); // Lower cases all characters in the string
//        name = name.trim(); // returns string without whitespace
//        name = name.replace("o", "a"); // returns string with first argument replaced with second

//        name.isEmpty(); // returns boolean value dependent on if string holds any value
//        name.contains(" "); // returns boolean value dependent on if string holds argument
//        name.equals("String"); // returns boolean value dependent on if name equals "String"
//        name.equalsIgnoreCase("String"); // returns boolean value dependent on if name equals "String" not case sensitive

        System.out.println(length);
    }
}
