import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 10; // Number of employees

        // Arrays
        double[] salary = new double[n];
        double[] service = new double[n];
        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Taking input
        System.out.println("Enter Salary and Years of Service for 10 Employees:");

        for (int i = 0; i < n; i++) {

            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            double yrs = sc.nextDouble();

            // Validation
            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input! Enter again.");
                i--; // Decrement index
