import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = 0.0;
        double height = 0.0;
        boolean validInput;

        // Get width
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                if (width > 0) {
                    validInput = true;
                } else {
                    System.out.println("Width must be greater than 0.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();
                validInput = false;
            }
        } while (!validInput);

        // Get height
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                if (height > 0) {
                    validInput = true;
                } else {
                    System.out.println("Height must be greater than 0.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();
                validInput = false;
            }
        } while (!validInput);

        // Calculations
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        // Results
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Diagonal: %.2f%n", diagonal);

        scanner.close();
    }
}
