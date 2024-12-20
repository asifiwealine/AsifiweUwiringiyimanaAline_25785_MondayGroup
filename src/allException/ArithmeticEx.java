package allException;

// This program demonstrates handling division by zero.
// Imports the Scanner class for user input.
import java.util.Scanner;

public class ArithmeticEx {
    public static void main(String[] args) {
        // Creates a Scanner object for reading input.
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                // Prompts the user for the dividend and divisor.
                System.out.print("Enter dividend: ");
                int dividend = scanner.nextInt();

                System.out.print("Enter divisor: ");
                int divisor = scanner.nextInt();

                // Performs the division operation.
                int result = dividend / divisor;

                // Prints the result if division is successful.
                System.out.println("Result: " + result);
                break;
            } catch (ArithmeticException e) {
                // Catches division by zero and displays an error message.
                System.out.println("Arithmetic exception: " + e.getMessage());
            }
        }
        scanner.close(); // Closes the scanner to prevent resource leaks.
    }
}
