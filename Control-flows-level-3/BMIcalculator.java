import java.util.Scanner;
 class BMICalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height from cm to meter
        double heightMeter = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeter * heightMeter);

        // Display BMI
        System.out.println("Your BMI is: " + bmi);

        // Determine weight status
        if (bmi < 18.5) {
            System.out.println("Status: Underweight");
        } 
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Status: Normal weight");
        } 
        else if (bmi >= 25 && bmi < 30) {
            System.out.println("Status: Overweight");
        } 
        else {
            System.out.println("Status: Obese");
        }

        sc.close();
    }
}
