import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        // Check for valid input
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
            return;
        }

        System.out.println("Multiples of " + number + " below 100 are:");

        int counter = 100; // Start from 100

        // While loop from 100 down to 1
        while (counter >= 1) {
            if (counter % number == 0) { // Check if counter is multiple
                System.out.println(counter);
            }
            counter--; // Decrement counter
        }

        sc.close();
    }
}