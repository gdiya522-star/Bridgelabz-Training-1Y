import java.util.Scanner;

public class FizzBuzzFactors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive number.");
        } 
        else {

            System.out.println("Factors between 1 to 20 are:");

            for (int i = 1; i <= 20; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }

        sc.close();
    }
}
