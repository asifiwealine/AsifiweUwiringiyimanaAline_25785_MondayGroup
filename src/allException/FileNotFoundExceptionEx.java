
package allException;

// Demonstrates handling a FileNotFoundException with user input for the file name.
import java.io.*; // Required for file input/output operations.
import java.util.Scanner; // Required for user input.

public class FileNotFoundExceptionEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object for user input.
        FileReader file = null; // Initializes FileReader.
        while (file == null) { // Loops until a valid file is provided.
            try {
                System.out.print("Enter the name of the file to open: "); // Prompts the user for a file name.
                String fileName = scanner.nextLine(); // Reads the file name input.
                file = new FileReader(fileName); // Tries to open the file.
                System.out.println("File opened successfully."); // Informs success.
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage() + ". Try again."); // Handles the exception.
            }
        }
    }
}
