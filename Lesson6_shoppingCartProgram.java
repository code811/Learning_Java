import java.util.Scanner;

public class Lesson6_shoppingCartProgram {
    public static void main(String[] args) {

        // SHOPPING CART PROGRAM
        Scanner sc = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = sc.nextLine();
        System.out.print("What is the price of that item?: ");
        price = Double.parseDouble(sc.nextLine());
        System.out.print("How many would you like?: ");
        quantity = Integer.parseInt(sc.nextLine());

        total = price * quantity;

        System.out.println('\n' + "You have bought " + quantity + ' ' + item + "/s");
        System.out.println("Your total is " + currency + total);

        sc.close();

    }
}
