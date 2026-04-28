public class Lesson12_nestedIfStatements {
    public static void main(String[] args) {

        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent) {
            if(isSenior) {
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7; // gives both 10% and 20% discount
            }
            else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9; // gives 10% discount
            }
        }
        else {
            if(isSenior) {
                System.out.println("You get a senior discount of 20%");
                price *= 0.8; // gives 20% discount
            }
            else {
                price *= 1; // not a student, does not get 10% nor 20% discount
            }
        }


        System.out.printf("The price of a ticket is: $%.2f", price);
    }
}
