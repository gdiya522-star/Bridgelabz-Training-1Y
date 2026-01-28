import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int greatestFactor = 1; // Initialize greatest factor
        int counter = number - 1; // Start from number - 1

        // While loop to find greatest factor
        while (counter >= 1) {
            if (number % counter == 0) { // Check if counter is a factor
                greatestFactor = counter; // Assign to greatestFactor
                break; // Exit loop after finding greatest factor
            }
            counter--; // Decrement counter
        }

        // Display the result
        System.out.println("Greatest factor of " + number + " besides itself is: " + greatestFactor);

        sc.close();
    }
}