import java.util.Scanner;
 class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        // Calculate total and average
        int total = physics + chemistry + maths;
        double average = total / 3.0;

        // Display average
        System.out.println("\nAverage Marks: " + average);

        // Calculate grade and remarks
        if (average >= 90) {
            System.out.println("Grade: A+");
            System.out.println("Remarks: Excellent");
        }
        else if (average >= 80) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Very Good");
        }
        else if (average >= 70) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Good");
        }
        else if (average >= 60) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Average");
        }
        else if (average >= 50) {
            System.out.println("Grade: D");
            System.out.println("Remarks: Pass");
        }
        else {
            System.out.println("Grade: F");
            System.out.println("Remarks: Fail");
        }

        sc.close();
    }
}
