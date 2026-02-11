import java.util.Scanner;

public class VotingCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Define array of 10 elements
        int[] age = new int[10];

        // Take input
        System.out.println("Enter age of 10 students:");

        for (int i = 0; i < age.length; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            age[i] = sc.nextInt();
        }

        System.out.println("\nVoting Eligibility:");

        // Check voting eligibility
        for (int i = 0; i < age.length; i++) {

            if (age[i] < 0) {
                System.out.println("Invalid age: " + age[i]);
            } 
            else if (age[i] >= 18) {
                System.out.println("The student with age " + age[i] + " can vote.");
            } 
            else {
                System.out.println("The student with age " + age[i] + " cannot vote.");
            }
        }

        sc.close();
    }
}
