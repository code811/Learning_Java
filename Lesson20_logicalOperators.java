public class Lesson20_logicalOperators {
    public static void main(String[] args) {

        // && - AND
        // !! = OR
        // ! = NOT

        double temp = 20;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is GOOD!");
            System.out.println("It is SUNNY outside!");
        }
    }
}
