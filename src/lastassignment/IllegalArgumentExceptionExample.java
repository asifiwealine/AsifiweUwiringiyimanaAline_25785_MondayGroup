
package lastassignment;

// This program demonstrates handling an IllegalArgumentException.

public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        while (true) {
            try {
                // Prompts the user to set an age.
                System.out.print("Enter age: ");
                java.util.Scanner scanner = new java.util.Scanner(System.in);
                int age = scanner.nextInt();

                // Calls the setAge method, which validates the age.
                setAge(age);

                // If valid, prints the age and exits the loop.
                System.out.println("Age is set to: " + age);
                break;
            } catch (IllegalArgumentException e) {
                // Catches invalid age input and displays an error message.
                System.out.println("Illegal argument: " + e.getMessage());
            }
        }
    }

    public static void setAge(int age) {
        // Validates the age. Throws an exception if age is negative.
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
    }
}

