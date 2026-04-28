public class Lesson39_OOP {
    public static void main(String[] args) {
        // Object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type


        Lesson39_Car car = new Lesson39_Car();

        car.drive();
        car.brake();

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

        car.isRunning = true;

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
    }
}
