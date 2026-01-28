import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if number is natural
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {

            int sumForLoop = 0;

            // Calculate using for loop
            for (int i = 1; i <= n; i++) {
                sumForLoop = sumForLoop + i;
            }

            // Calculate using formula
            int sumFormula = n * (n + 1) / 2;

            // Print results
            System.out.println("Sum using for loop = " + sumForLoop);
            System.out.println("Sum using formula = " + sumFormula);

            // Compare results
            if (sumForLoop == sumFormula) {
                System.out.println("Both results are equal.");
            } else {
                System.out.println("Results are NOT equal.");
            }
        }

        sc.close();
    }
}
