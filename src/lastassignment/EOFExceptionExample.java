
package lastassignment;


// Demonstrates handling an EOFException when reading a file until the end.
import java.io.*; // Required for file input/output operations.
import java.util.Scanner; // Required for user input.

public class EOFExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object for user input.
        DataInputStream dis = null; // Initializes DataInputStream.
        while (dis == null) { // Loops until a valid file is provided.
            try {
                System.out.print("Enter the name of the binary file to read: "); // Prompts the user for a file name.
                String fileName = scanner.nextLine(); // Reads the file name input.
                dis = new DataInputStream(new FileInputStream(fileName)); // Tries to open the file.
                while (true) {
                    System.out.println("Read data: " + dis.readUTF()); // Reads and prints data from the file.
                }
            } catch (EOFException e) {
                System.out.println("Reached the end of the file."); // Handles the EOF exception.
            } catch (IOException e) {
                System.out.println("IOException: " + e.getMessage() + ". Try again."); // Handles other IOExceptions.
            }
        }
    }
}

