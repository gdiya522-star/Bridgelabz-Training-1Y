import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        // Check if number is positive
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } 
        else {

            // Loop from 1 to n
            for (int i = 1; i <= n; i++) {

                // Check for FizzBuzz
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }

                // Check for Fizz
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }

                // Check for Buzz
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }

                // Print number
                else {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
