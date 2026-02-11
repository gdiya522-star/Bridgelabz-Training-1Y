import java.util.Scanner;

public class CheckNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Declare array
        int arr[] = new int[5];

        // Step 2: Take input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Check each number
        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            if (num > 0) {
                System.out.print(num + " is Positive and ");

                if (num % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }

            } else if (num < 0) {
                System.out.println(num + " is Negative");

            } else {
                System.out.println(num + " is Zero");
            }
        }

        // Step 4: Compare first and last element
        int first = arr[0];
        int last = arr[arr.length - 1];

        System.out.println("\nComparison of First and Last Element:");

        if (first == last) {
            System.out.println("First and Last elements are Equal");
        } 
        else if (first > last) {
            System.out.println("First element is Greater than Last");
        } 
        else {
            System.out.println("First element is Less than Last");
        }

        sc.close();
    }
}
