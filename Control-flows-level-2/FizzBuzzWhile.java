public class FizzBuzzWhile {
    public static void main(String[] args) {

        int i = 1;   // start from 1
        int n = 100; // end at 100

        while (i <= n) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }

            i++; // increment
        }
    }
}
