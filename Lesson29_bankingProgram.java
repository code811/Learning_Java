import java.util.Scanner;

public class Lesson29_bankingProgram {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        double balance = 0;
        boolean isRunning = true;

        while(isRunning) {
            System.out.println("Welcome to the Banking Program!");
            System.out.println("To begin, please select an option!");
            System.out.println("-------------------------------------");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Select your choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch(choice) {
                case 1: {
                    showBalance(balance);
                    break;
                }
                case 2: {
                    balance = deposit(balance);
                    break;
                }
                case 3: {
                    balance = withdraw(balance);
                    break;
                }
                case 4: {
                    isRunning = false;
                }
            }
            System.out.println();
        }

        System.out.println("Thank you for using the Banking Program!");
        sc.close();
    }

    static void showBalance(double balance) {
        System.out.printf("Your remaining balance is: $%.2f\n", balance);
    }

    static double deposit(double balance) {
        System.out.print("How much would you like to deposit?: +$");
        double deposit = Double.parseDouble(sc.nextLine());

        if(deposit < 0) {
            System.out.println("The amount is invalid!");
            return balance;
        }

        System.out.println("Deposit Successful!");
        return (balance + deposit);
    }

    static double withdraw(double balance) {
        System.out.print("How much would you like to withdraw?: -$");
        double withdraw = Double.parseDouble(sc.nextLine());

        if(withdraw > balance) {
            System.out.println("Insufficient funds!");
            return balance;
        }

        System.out.println("Withdrawal Successful!");
        return (balance - withdraw);
    }
}
