import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Calculations
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Output
        System.out.println("The distance in yards is " + distanceInYards +
                " while the distance in miles is " + distanceInMiles);

        sc.close();
    }
}