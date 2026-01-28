public class DayOfWeek {

    public static void main(String[] args) {

        // Check if 3 arguments are provided
        if (args.length != 3) {
            System.out.println("Please enter month, day, and year.");
            return;
        }

        // Read command-line arguments
        int m = Integer.parseInt(args[0]); // Month
        int d = Integer.parseInt(args[1]); // Day
        int y = Integer.parseInt(args[2]); // Year

        // Adjust month and year for Jan & Feb
        if (m < 3) {
            m = m + 12;
            y = y - 1;
        }

        int k = y % 100;   // Year of century
        int j = y / 100;   // Century

        // Zeller’s Formula
        int day = (d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        // Convert to required format
        int result = (day + 6) % 7;

        System.out.println("Day of Week: " + result);
    }
}
