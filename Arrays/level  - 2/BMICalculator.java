import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input for number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // b. Create arrays
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // c. Take input for weight and height
        for (int i = 0; i < n; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter weight (in kg): ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height (in meters): ");
            height[i] = sc.nextDouble();
        }

        // d. Calculate BMI and status
        for (int i = 0; i < n; i++) {

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } 
            else if (bmi[i] >= 18.5 && bmi[i] < 25) {
                status[i] = "Normal";
            } 
            else if (bmi[i] >= 25 && bmi[i] < 30) {
                status[i] = "Overweight";
            } 
            else {
                status[i] = "Obese";
            }
        }

        // e. Display result
        System.out.println("\n------ BMI Report ------");

        for (int i = 0; i < n; i++) {

            System.out.println("\nPerson " + (i + 1));
            System.out.println("Height : " + height[i] + " m");
            System.out.println("Weight : " + weight[i] + " kg");
            System.out.println("BMI    : " + String.format("%.2f", bmi[i]));
            System.out.println("Status : " + status[i]);
        }

        sc.close();
    }
}
