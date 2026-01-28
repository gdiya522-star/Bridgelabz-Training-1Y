import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer as the base: ");
        int number = sc.nextInt();

        System.out.print("Enter a positive integer as the power: ");
        int power = sc.nextInt();

        // Check if inputs are positive
        if (number < 0 || power < 0) {
            System.out.println("Please enter positive integers only.");
            return;
        }

        int result = 1; // Initialize result

        // For loop to calculate power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result by number in each iteration
        }

        // Print the result
        System.out.println(number + " raised to the power " + power + " is: " + result);

        sc.close();
    }
}