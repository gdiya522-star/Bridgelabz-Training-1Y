import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input salary
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        // Input years of service
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus = 0;

        // Check condition
        if (years > 5) {
            bonus = salary * 0.05;   // 5% bonus
            System.out.println("You got a bonus of: " + bonus);
        } else {
            System.out.println("No bonus. Service is less than 5 years.");
        }

        sc.close();
	}
}
	
