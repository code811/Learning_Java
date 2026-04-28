import javax.xml.catalog.Catalog;

public class Lesson44_inheritance {
    public static void main(String[] args) {

        // Inheritance = One class inherits the attributes and methods
        //               from another class.
        //               Child <- Parent <- Grandparent
        //                                  ^ Multi-level inheritance
        //                        ^ Are related, but not the same (Both organisms, one is an animal, the other is a plant)

        Lesson44_dog dog = new Lesson44_dog();
        Lesson44_cat cat = new Lesson44_cat();

        dog.eat(); // Both children are able to utilize methods and fields through their parent
        cat.eat(); // This allows a multitude of children to reference ONE body of code, the parent

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.speak(); // Each child can have its own individuality
        cat.speak();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        Lesson44_plant plant = new Lesson44_plant();
        System.out.println(plant.isAlive); // Parent inheriting from Grandparent (Organism)
        plant.photosynthesize(); // From Parent class (plant)

//        dog.photosynthesize(); // Does not inherit method from Plant class as it's not the child of this class, but of the animal class
    }
}
