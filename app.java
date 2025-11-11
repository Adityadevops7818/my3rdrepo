// This is a single-line comment.
/*
 * This is a multi-line comment.
 * It can span multiple lines.
 */

// Define a package for organizing classes.
package com.example.helloworld;

// Import necessary classes from other packages.
import java.lang.System; // This is implicitly imported, but shown for illustration.

/**
 * This is a Javadoc comment for the HelloWorld class.
 * It provides documentation about the class.
 */
public class HelloWorld {

    // A static variable (class variable).
    public static final String GREETING = "Hello, World!";

    /**
     * This is the main method, the entry point of the program.
     * @param args Command-line arguments passed to the program.
     */
    public static void main(String[] args) {
        // Print the greeting to the console.
        System.out.println(GREETING);

        // You can also print other messages or perform operations here.
        int number = 10;
        System.out.println("The number is: " + number);
    }
}
