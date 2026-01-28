import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            // check for 0 or negative number
            if (num <= 0) {
                break;   // exit the loop
            }

            sum = sum + num;
        }

        System.out.println("Sum of entered numbers = " + sum);
        sc.close();
    }
}