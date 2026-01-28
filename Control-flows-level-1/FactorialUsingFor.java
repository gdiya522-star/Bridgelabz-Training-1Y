import java.util.Scanner;

public class FactorialUsingFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();

        // Check if number is natural
        if (num < 0) {
            System.out.println("Please enter a natural number.");
        } 
        else {
            long factorial = 1;

            // Calculate factorial using for loop
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }

            // Print result
            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        sc.close();
    }
}

