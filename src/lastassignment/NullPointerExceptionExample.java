
package lastassignment;
// This program demonstrates handling a NullPointerException.
// Imports the Scanner class for user input.
import java.util.Scanner;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        // Creates a Scanner object for reading input.
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                // Prompts the user to enter a string.
                System.out.print("Enter a string: ");
                String str = scanner.nextLine();

                // Tries to print the length of the entered string.
                System.out.println("Length of string: " + str.length());
                break;
            } catch (NullPointerException e) {
                // Catches null input and displays an error message.
                System.out.println("Null pointer exception: String cannot be null.");
            }
        }
        scanner.close(); // Closes the scanner to prevent resource leaks.
    }
}

