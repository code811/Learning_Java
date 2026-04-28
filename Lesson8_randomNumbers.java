import java.util.Random;

public class Lesson8_randomNumbers {
    public static void main(String[] args) {

        Random random = new Random(); // creating random object

        int number1;
        int number2;
        int number3;

        //                      inclusive exclusive
        number1 = random.nextInt(1, 101);
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);


        double number;

        number = random.nextDouble();

        System.out.println(number);


        boolean isHeads;

        isHeads = random.nextBoolean();

        System.out.println(isHeads);
        if(isHeads) {
            System.out.println("HEADS!");
        }
        else {
            System.out.println("TAILS!");
        }
    }
}
