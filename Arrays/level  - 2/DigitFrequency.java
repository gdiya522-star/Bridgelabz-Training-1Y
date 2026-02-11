import java.util.Scanner;

 class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong(); 
        long temp = num;

        int[] frequency = new int[10]; 

        while (temp != 0) {
            int digit = (int)(temp % 10);
            frequency[digit]++;
            temp /= 10;
        }

        System.out.println("\nDigit\tFrequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + "\t" + frequency[i]);
            }
        }

    }
}