import java.util.Scanner;

public class Lesson19_calculatorProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = Double.parseDouble(sc.nextLine());
        System.out.print("Enter the operation you wish to perform (+ - * / ^): ");
        char operator = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Enter the second number: ");
        double num2 = Double.parseDouble(sc.nextLine());

        boolean validOperation = true;
        double result = 0;
        switch(operator) {
            case '+': {
                result = num1 + num2;
                break;
            }
            case '-': {
                result = num1 - num2;
                break;
            }
            case '*': {
                result = num1 * num2;
                break;
            }
            case '/': {

                if(num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    validOperation = false;
                    break;
                }
                result = num1 / num2;
                break;
            }
            case '^': {
                result = Math.pow(num1, num2);
                break;
            }
            default: {
                System.out.println("Please enter a proper operator!");
                validOperation = false;
            }
        }

        if(validOperation) {
            System.out.println(result);
        }

        sc.close();
    }
}
