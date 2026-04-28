import java.sql.SQLOutput;
import java.util.Scanner;

public class Lesson9_mathClass {
    public static void main(String[] args) {

//        System.out.println(Math.PI);
//        System.out.println(Math.E);

//        double result;

//        result = Math.pow(2, 3); // exponential
//        result = Math.abs(-5); // absolute value
//        result = Math.sqrt(9); // square root
//        result = Math.round(3.14); // rounds to the nearest whole integer
//        result = Math.ceil(3.14); // rounds up
//        result = Math.floor(3.99); // rounds down
//        result = Math.max(10, 20); // returns the highest value between the two
//        result = Math.min(10, 20); // returns the lowest value between the two
//
//        System.out.println(result);


            /*
        // HYPOTENUSE c = Math.sqrt(a^2 + b^2)

        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = Double.parseDouble(sc.nextLine());
        System.out.print("Enter the length of side B: ");
        b = Double.parseDouble(sc.nextLine());

//        System.out.println(a); // tests code
//        System.out.println(b);

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse (side c) is: " + c + "cm");

        sc.close();
             */

        // circumference = 2 * Math.PI * radius;
        // area = Math.Pi * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        Scanner sc = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = Double.parseDouble(sc.nextLine());

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference is: %.1fcm\n", circumference);
        System.out.printf("The area is: %.1fcm^2\n", area);
        System.out.printf("The volume is: %.1fcm^3\n", volume);

        sc.close();
    }
}
