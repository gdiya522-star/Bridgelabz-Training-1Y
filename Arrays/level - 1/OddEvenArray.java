import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Get input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check for natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number (greater than 0).");
            return; // Exit program
        }

        // Step 2: Create arrays
        int size = number / 2 + 1;
        int[] even = new int[size];
        int[] odd = new int[size];

        // Step 3: Index variables
        int evenIndex = 0;
        int oddIndex = 0;

        // Step 4: Loop from 1 to number
        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        // Step 5: Print Odd Numbers
        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        // Print Even Numbers
        System.out.println("\n\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        sc.close();
    }
}
