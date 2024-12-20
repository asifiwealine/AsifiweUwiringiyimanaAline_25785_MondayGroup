
package lastassignment;

// This program demonstrates handling an ArrayIndexOutOfBoundsException.
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        // Creates an array of integers with predefined values.
        int[] numbers = {1, 2, 3};

        // Creates a Scanner object for reading input.
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                // Prompts the user for an index.
                System.out.print("Enter an index (0 to 2): ");
                int index = scanner.nextInt();

                // Tries to access the array at the specified index.
                System.out.println("Value at index " + index + ": " + numbers[index]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                // Catches invalid index access and displays an error message.
                System.out.println("Array index out of bounds: " + e.getMessage());
            }
        }
        scanner.close(); // Closes the scanner to prevent resource leaks.
    }
}
