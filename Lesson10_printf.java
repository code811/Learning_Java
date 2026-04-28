public class Lesson10_printf {
    public static void main(String[] args) {

        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]
        // % is called a placeholder


        // %[specifier-character]
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);


        // %[flags][.precision][specifier-character]

        // [flags]
        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price1 = 9.99;
        double price2 = 100000.15;
        double price3 = -54.01;

        System.out.printf("%+.1f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%(.3f\n", price3);

        // %[width][specifier-character]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1); // pads from the left with zeros till number is 4 digits long
        System.out.printf("%4d\n", id2);  // pads from the left with space till number is 4 digits long
        System.out.printf("%-4d\n", id3); // pads from the right with spaces till number is 4 digits long
        System.out.printf("%04d\n", id4);

    }
}
