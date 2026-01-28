import java.util.Scanner;

public class PowerUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the base (positive integer): ");
        int number = sc.nextInt();

        System.out.print("Enter the exponent (positive integer): ");
        int power = sc.nextInt();

        // Check for positive integers
        if (number < 0 || power < 0) {
            System.out.println("Please enter positive integers only.");
            return;
        }

        int result = 1;     // Initialize result
        int counter = 0;    // Initialize counter

        // While loop to calculate power
        while (counter < power) {
            result *= number; // Multiply result by base
            counter++;        // Increment counter
        }

        // Display the result
        System.out.println(number + " raised to the power " + power + "