import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown number: ");
        int counter = sc.nextInt();   // user input

        while (counter >= 1) {
            System.out.println(counter);
            counter--;   // decrement
        }

        System.out.println(" Launch!");
    }
}
