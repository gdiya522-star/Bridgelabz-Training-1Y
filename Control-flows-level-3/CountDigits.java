import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Check for 0 case
        if (number == 0) {
            System.out.println("Number of digits: 1");
        } else {

            int count = 0;

            // Make number positive if it is negative
            number = Math.abs(number);

            // Loop to count digits
            while (number != 0) {
                number = number / 10; // Remove last digit
                count++;              // Increase count
            }

            // Display result
            System.out.println("Number of digits: " + count);
        }

        sc.close();
    }
}
