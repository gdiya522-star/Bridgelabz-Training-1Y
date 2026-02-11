import java.util.Scanner;
 class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10; 

        double[] salary = new double[n];
        int[] yearsOfService = new int[n];
        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years of service of employee " + (i + 1) + ": ");
            yearsOfService[i] = sc.nextInt();
        }

        double totalBonus = 0;

        for (int i = 0; i < n; i++) {
            if (yearsOfService[i] < 5) {
                bonus[i] = salary[i] * 0.05;
            } else if (yearsOfService[i] <= 10) {
                bonus[i] = salary[i] * 0.10;
            } else {
                bonus[i] = salary[i] * 0.15;
            }

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
        }

        System.out.println("\nEmployee Salary and Bonus Details:");
        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");
        for (int i = 0; i < n; i++) {
            System.out.printf( i + 1, salary[i], yearsOfService[i], bonus[i], newSalary[i]);
        }

        System.out.printf("\nTotal bonus to be paid by the company: %.2f\n", totalBonus);

    }
}