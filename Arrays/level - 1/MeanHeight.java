import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create array of size 11
        double[] heights = new double[11];

        double sum = 0;

        // Take input from user
        System.out.println("Enter heights of 11 players (in cm):");

        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
            sum = sum + heights[i];   // Add to sum
        }

        // Calculate mean
        double mean = sum / 11;

        // Print result
        System.out.println("Mean height of the football team: " + mean + " cm");

        sc.close();
    }
}
