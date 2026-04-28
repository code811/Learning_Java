public class Lesson42_arrayOfObjects {
    public static void main(String[] args) {

//        Lesson42_Car car1 = new Lesson42_Car("Mustang", "Red");
//        Lesson42_Car car2 = new Lesson42_Car("Corvette", "Blue");
//        Lesson42_Car car3 = new Lesson42_Car("Charger", "Yellow");
//
//        Lesson42_Car[] cars = {car1, car2, car3};
//
//        for(int i = 0; i < cars.length; i++) {
//            cars[i].drive();
//        }
//
//        for(Lesson42_Car car : cars) {
//            car.drive();

        // works the same as code above
        Lesson42_Car[] cars = {new Lesson42_Car("Mustang", "Red"), // Constructing a new object without giving it a unique identifier;
                               new Lesson42_Car("Corvette", "Blue"), // these are known as anonymous objects
                               new Lesson42_Car("Charger", "Yellow")};

        for(Lesson42_Car car : cars) {
            car.color = "black";
        }

        for(Lesson42_Car car : cars) {
            car.drive();
        }
    }
}
