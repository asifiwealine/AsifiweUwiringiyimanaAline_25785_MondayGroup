
package allException;
// Demonstrates handling a ClassNotFoundException with user input for a class name.
import java.util.Scanner; // Required for user input.

public class ClassNotFoundExceptionEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object for user input.
        boolean classLoaded = false; // Tracks if the class is successfully loaded.
        while (!classLoaded) { // Loops until a valid class is provided.
            try {
                System.out.print("Enter the fully qualified name of the class to load: "); // Prompts for a class name.
                String className = scanner.nextLine(); // Reads the class name input.
                Class.forName(className); // Attempts to load the class.
                System.out.println("Class loaded successfully."); // Informs success.
                classLoaded = true; // Ends the loop.
            } catch (ClassNotFoundException e) {
                System.out.println("Class not found: " + e.getMessage() + ". Try again."); // Handles the exception.
            }
        }
    }
}

