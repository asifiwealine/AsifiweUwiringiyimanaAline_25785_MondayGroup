
package lastassignment;

// This program demonstrates handling a ClassCastException.

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        try {
            // Declares an object of type String.
            Object obj = "String";

            // Attempts to cast the object to an Integer, which is invalid.
            Integer num = (Integer) obj;

            // If the cast is successful (which it won't be), print the value.
            System.out.println("Number: " + num);
        } catch (ClassCastException e) {
            // Catches the exception and displays an error message.
            System.out.println("Class cast exception: " + e.getMessage());
        }
    }
}

