import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // Check if number is positive
        if (num < 0) {
            System.out.println("Please enter a positive integer.");
        } 
        else {

            long factorial = 1;   // To store result
            int i = 1;            // Loop counter

            // While loop to calculate factorial
            while (i <= num) {
                factorial = factorial * i;
                i++;
            }

            // Print result
            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        sc.close();
    }
}
