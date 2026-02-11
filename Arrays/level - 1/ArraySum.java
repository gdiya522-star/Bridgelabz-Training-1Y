import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Declare array, total, and index
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // b. Infinite while loop
        while (true) {

            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();

            // c. Stop if 0 or negative
            if (num <= 0) {
                break;
            }

            // d. Stop if array is full
            if (index == 10) {
                System.out.println("Array limit reached (10 elements).");
                break;
            }

            // e. Store value and increase index
            numbers[index] = num;
            index++;
        }

        // f. Calculate sum using for loop
        System.out.println("\nStored Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // g. Display total
        System.out.println("\nSum of all numbers = " + total);

        sc.close();
    }
}
