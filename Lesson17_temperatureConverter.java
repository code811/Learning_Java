import java.util.Scanner;

public class Lesson17_temperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temp = Double.parseDouble(sc.nextLine());
        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        String unit = sc.nextLine().toUpperCase();

        double newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("%.1fo%s", newTemp, unit);

        sc.close();
    }
}
