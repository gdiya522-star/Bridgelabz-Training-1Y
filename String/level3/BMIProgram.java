package com.gla.String.level3;

import java.util.Scanner;

public class BMIProgram {

    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);

        String status;

        if (bmi < 18.5)
            status = "Underweight";
        else if (bmi < 25)
            status = "Normal";
        else if (bmi < 30)
            status = "Overweight";
        else
            status = "Obese";

        String[] result = new String[4];
        result[0] = String.format("%.2f", heightCm);
        result[1] = String.format("%.2f", weight);
        result[2] = String.format("%.2f", bmi);
        result[3] = status;

        return result;
    }

    public static String[][] computeBMI(double[][] data) {

        String[][] result = new String[10][4];

        for (int i = 0; i < data.length; i++) {
            String[] bmiData = calculateBMI(data[i][0], data[i][1]);
            result[i] = bmiData;
        }

        return result;
    }

    public static void display(String[][] result) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" +
                    result[i][1] + "\t\t" +
                    result[i][2] + "\t" +
                    result[i][3]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for person " + (i+1));
            data[i][0] = sc.nextDouble();

            System.out.println("Enter height (cm) for person " + (i+1));
            data[i][1] = sc.nextDouble();
        }

        String[][] result = computeBMI(data);
        display(result);
    }
}
