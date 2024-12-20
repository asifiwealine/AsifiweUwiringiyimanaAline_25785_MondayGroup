
package lastassignment;

// Demonstrates handling an IOException with user input for the file name.
import java.io.*; // Required for file input/output operations.
import java.util.Scanner; // Required for user input.

public class IOExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object for user input.
        BufferedReader reader = null; // Initializes BufferedReader.
        while (reader == null) { // Loops until a valid file is provided.
            try {
                System.out.print("Enter the name of the file to read: "); // Prompts the user for a file name.
                String fileName = scanner.nextLine(); // Reads the file name input.
                reader = new BufferedReader(new FileReader(fileName)); // Tries to open the file.
                System.out.println("First line of the file: " + reader.readLine()); // Reads and prints the first line.
            } catch (IOException e) {
                System.out.println("IOException occurred: " + e.getMessage() + ". Try again."); // Handles the exception.
            }
        }
    }
}
