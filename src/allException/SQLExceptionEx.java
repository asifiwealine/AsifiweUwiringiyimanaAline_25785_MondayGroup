/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Demonstrates handling an SQLException while connecting to a database.
import java.sql.*; // Required for database operations.
import java.util.Scanner; // Required for user input.

public class SQLExceptionEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object for user input.
        Connection conn = null; // Initializes the database connection.
        while (conn == null) { // Loops until a valid connection is established.
            try {
                System.out.print("Enter database URL: "); // Prompts the user for a database URL.
                String dbUrl = scanner.nextLine(); // Reads the database URL input.
                System.out.print("Enter username: "); // Prompts for username.
                String user = scanner.nextLine(); // Reads the username input.
                System.out.print("Enter password: "); // Prompts for password.
                String password = scanner.nextLine(); // Reads the password input.
                conn = DriverManager.getConnection(dbUrl, user, password); // Tries to connect to the database.
                System.out.println("Connected to the database successfully."); // Informs success.
            } catch (SQLException e) {
                System.out.println("SQL Exception: " + e.getMessage() + ". Try again."); // Handles the exception.
            }
        }
    }
}
