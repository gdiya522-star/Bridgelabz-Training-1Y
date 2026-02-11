import java.util.Scanner;

class BMICalculator2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of team members: ");
        int n = sc.nextInt();

        double[][] data = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();  // height

            System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();  // weight
        }

        for (int i = 0; i < n; i++) {
            data[i][2] = data[i][1] / (data[i][0] * data[i][0]);  // BMI

            if (data[i][2] < 18.5) {
                status[i] = "Underweight";
            } else if (data[i][2] < 25) {
                status[i] = "Normal";
            } else if (data[i][2] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", data[i][0], data[i][1], data[i][2], status[i]);
        }

    }
}