import java.util.Scanner;

public class GreatestFactor {
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

        // Loop from number-1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { // Check if i is a factor
                greatestFactor = i; // Assign to greatestFactor
                break; // Exit loop once greatest factor is found
            }
        }

        // Display the result
        System.out.println("Greatest factor of " + number + " besides itself is: " + greatestFactor);

        sc.close();
    }
}