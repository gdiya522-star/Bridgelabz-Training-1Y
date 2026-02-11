import java.util.Scanner;

public class FactorsOfNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step a: Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step b: Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Step c: Find factors
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                // Step d: Resize array if full
                if (index == maxFactor) {

                    maxFactor = maxFactor * 2;

                    int[] temp = new int[maxFactor];

                    // Copy old elements
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp;
                }

                // Store factor
                factors[index] = i;
                index++;
            }
        }

        // Step e: Display factors
        System.out.println("Factors of " + number + " are:");

        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}
