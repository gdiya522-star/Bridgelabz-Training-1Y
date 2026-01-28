import java.util.Scanner;

public class FriendsInfo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input age and height
        System.out.println("Enter Amar's age:");
        int ageAmar = sc.nextInt();
        System.out.println("Enter Amar's height:");
        double heightAmar = sc.nextDouble();

        System.out.println("Enter Akbar's age:");
        int ageAkbar = sc.nextInt();
        System.out.println("Enter Akbar's height:");
        double heightAkbar = sc.nextDouble();

        System.out.println("Enter Anthony's age:");
        int ageAnthony = sc.nextInt();
        System.out.println("Enter Anthony's height:");
        double heightAnthony = sc.nextDouble();

        // Find youngest
        int minAge = ageAmar;
        String youngest = "Amar";

        if (ageAkbar < minAge) {
            minAge = ageAkbar;
            youngest = "Akbar";
        }

        if (ageAnthony < minAge) {
            minAge = ageAnthony;
            youngest = "Anthony";
        }

        // Find tallest
        double maxHeight = heightAmar;
        String tallest = "Amar";

        if (heightAkbar > maxHeight) {
            maxHeight = heightAkbar;
            tallest = "Akbar";
        }

        if (heightAnthony > maxHeight) {
            maxHeight = heightAnthony;
            tallest = "Anthony";
        }

        // Output
        System.out.println("\nYoungest Friend: " + youngest + " (Age: " + minAge + ")");
        System.out.println("Tallest Friend: " + tallest + " (Height: " + maxHeight + " cm)");

        sc.close();
    }
}
	
