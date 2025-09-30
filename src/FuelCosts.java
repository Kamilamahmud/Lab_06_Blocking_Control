import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gallons = 0.0;
        double mpg = 0.0;
        double pricePerGallon = 0.0;
        boolean validInput;

        // Get gallons
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (scanner.hasNextDouble()) {
                gallons = scanner.nextDouble();
                if (gallons > 0) {
                    validInput = true;
                } else {
                    System.out.println("Value must be greater than 0.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();
                validInput = false;
            }
        } while (!validInput);

        // Get mpg
        do {
            System.out.print("Enter the fuel efficiency (miles per gallon): ");
            if (scanner.hasNextDouble()) {
                mpg = scanner.nextDouble();
                if (mpg > 0) {
                    validInput = true;
                } else {
                    System.out.println("Value must be greater than 0.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();
                validInput = false;
            }
        } while (!validInput);

        // Get price per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                pricePerGallon = scanner.nextDouble();
                if (pricePerGallon > 0) {
                    validInput = true;
                } else {
                    System.out.println("Value must be greater than 0.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();
                validInput = false;
            }
        } while (!validInput);

        // Calculations
        double costFor100Miles = (100 / mpg) * pricePerGallon;
        double rangeWithFullTank = gallons * mpg;

        // Results
        System.out.printf("Cost to drive 100 miles: $%.2f%n", costFor100Miles);
        System.out.printf("Range with a full tank: %.2f miles%n", rangeWithFullTank);

        scanner.close();
    }
}