package LessonRecursion;

public class Main {


    public static void main(String[] args) {
//        walk(5);
//        System.out.println(factorial(7));
        System.out.println(power(2, 8));
    }


//    public static void walk(int steps) { // Iterative approach
//
//        for(int i = 0; i < steps; i++) {
//            System.out.println("You take a step!");
//        }
//    }

    // Recursive approach
    // Programs has a structure called a "Call Stack" which keeps track of the order of which methods are first executed
    // Last in first out (LIFO) data structure
//    public static void walk(int steps) {
//
//        if(steps < 1) return; // Base case // Pops each walk() iteration from the last (top) to the first appearance (bottom) in the stack
//        System.out.println("You take a step!");
//        walk(steps - 1); // Recursive base // Pushes decrementing iterations of walk(steps - 1) to the top of the stack
//    }


//    public static int factorial(int num) {
//
//        if(num < 1) return 1; // Base case // Stops at 0 because factorials calculate down to 1! which is 1.
//        return num * factorial(num - 1); // Recursive case
//                                              // Once factorial((1) - 1) is reached, (num = 1) num will then decrement by 1 from the expression passed in the argument, thus in the next recursion of this method,
//                                              // the statement above will return 1, meaning (factorial(0) = 1) when (num = 1) thus making the statement:
//                                              // (num * 1) which equals 1 (remember: num = 1, when factorial(0) returns 1)
//                                              // This will then return 1 to the previous recursion method call: (factorial(1) when (num = 2) thus making the return statement:
//                                              // (num * 1) which equals 2 (remember: num = 2, when factorial(1) returns 1)
//                                              // This will then return 2 to the previous recursion method call: (factorial(2) when (num = 3) thus making the return statement:
//                                              // (num * 2) which equals 6 (remember: num = 3, when factorial(2) returns 2)
//                                              // so on so forth.
//    }


    public static int power(int base, int exponent) {

        if(exponent < 1) return 1; // Base case
        return base * power(base, exponent - 1); // Recursive case
    }
}


