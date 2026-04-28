public class Lesson49_fish implements Lesson49_Prey, Lesson49_Predator{

    @Override
    public void flee() {
        System.out.println("*The fish is swimming away*");
    }

    @Override
    public void hunt() {
        System.out.println("*The fish is hunting*");
    }
}
