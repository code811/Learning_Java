import java.util.Scanner;

public class Lesson11_compoundInterestCalculator {
    public static void main(String[] args) {

        // Compound interest calculator

        Scanner sc = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("What is the principal?: $");
        principal = Double.parseDouble(sc.nextLine());
        System.out.print("What is the annual interest rate?: %");
        rate = Double.parseDouble(sc.nextLine()) / 100;
        System.out.print("What is the number of times interest compounds annually?: ");
        timesCompounded = Integer.parseInt(sc.nextLine());
        System.out.print("What is the number of years?: ");
        years = Integer.parseInt(sc.nextLine());

        amount = principal * Math.pow((1 + (rate / timesCompounded)), (timesCompounded * years));

        System.out.printf("The amount after the interest accrued in %d years is: $%,.2f\n", years, amount);

        sc.close();
    }
}
