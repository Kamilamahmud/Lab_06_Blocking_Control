//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = 0.0;
        boolean validInput = false;

        // Keep asking until valid input is entered
        do {
            System.out.print("Enter temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                validInput = true; // valid number entered
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // clear the invalid input
            }
        } while (!validInput);

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Output result
        System.out.printf("%.2f °C is equivalent to %.2f °F%n", celsius, fahrenheit);

        scanner.close();
    }
}


