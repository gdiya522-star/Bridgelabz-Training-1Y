import java.util.Scanner;

public class Persq {
    public static void main(String arg[]) {
        Scanner side = new Scanner(System.in);
        System.out.println("Enter the side of a sqyare :");
        int s = side.nextInt();

        int peri = 4 * s;

        System.out.println("The length of the side is : " + s);
        System.out.println("Whose perimeter of square is : " + peri);
    }
}