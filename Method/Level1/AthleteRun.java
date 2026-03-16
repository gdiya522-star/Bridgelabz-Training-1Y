package com.gla.Method.Level1;

import java.util.Scanner;

class AthleteRun {

    public static double calculateRounds(double s1, double s2, double s3) {
        double perimeter = s1 + s2 + s3;   // perimeter of triangle
        double rounds = 5000 / perimeter;  // 5 km = 5000 meters
        return rounds;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 of triangle (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of triangle (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of triangle (in meters): ");
        double side3 = sc.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);

        System.out.println("Number of rounds needed to complete 5 km run: " + rounds);

        sc.close();
    }
}

