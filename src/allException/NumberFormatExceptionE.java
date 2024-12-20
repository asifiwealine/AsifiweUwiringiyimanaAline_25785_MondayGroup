
package allException;

// This program demonstrates handling a NumberFormatException.
// Imports the Scanner class for user input.
import java.util.Scanner;

public class NumberFormatExceptionE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                // Prompts the user to enter a valid number.
                System.out.print("Enter a valid integer: ");
                String input = scanner.nextLine();

                // Tries to parse the input string as an integer.
                int num = Integer.parseInt(input);

                // If successful, prints the integer and exits the loop.
                System.out.println("You entered: " + num);
                break;
            } catch (NumberFormatException e) {
                // Catches invalid input and displays an error message.
                System.out.println("Number format exception: " + e.getMessage());
            }
        }
        scanner.close(); // Closes the scanner to prevent resource leaks.
    }
}
