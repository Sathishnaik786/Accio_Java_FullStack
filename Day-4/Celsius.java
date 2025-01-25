import java.util.*;

public class Celsius {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Check if there is an integer input available
        if (scanner.hasNextInt()) {
            // Read the temperature in Celsius
            int tempInCelsius = scanner.nextInt();
            
            // Convert Celsius to Fahrenheit using the formula
            int tempInFahrenheit = (int) ((tempInCelsius * 9.0 / 5) + 32);
            
            // Print the temperature in Fahrenheit
            System.out.println(tempInFahrenheit);
        } else {
            System.out.println("No valid input provided.");
        }

        // Close the scanner
        scanner.close();
    }
}


// Celsius to Fahrenheit

// Given the temperature of a city in Celsius (C) represented by the variable tempInCelsius, your task is to convert the temperature to Fahrenheit (F) and print it.

// Formula : (C* (9/5)) + 32 = F

// Note: It is guaranteed that the temperature in Celsius, tempInCelsius, will be a multiple of 5.
// Input Format

// An integer tempInCelsius, represents the temperature in Celsius which is a multiple of 5.
// Output Format

// Print an integer containing the converted temperature in Fahrenheit.
// Example 1

// Input

// 25

// Output

// 77

// Explanation

// 25 * 9/5 + 32 = 77
// Example 2

// Input

// -40

// Output

// -40

// Explanation

// -40 * 9/5 + 32 = -40
// Constraints

// -1000 <= tempInCelsius <= 1000