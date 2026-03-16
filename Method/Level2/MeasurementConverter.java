package com.gla.Method.Level2;

import java.util.Scanner;

class MeasurementConverter {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = pounds * 0.453592;
        return pounds2kilograms;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = kilograms * 2.20462;
        return kilograms2pounds;
    }
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = gallons * 3.78541;
        return gallons2liters;
    }
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = liters / 3.78541;
        return liters2gallons;
    }
}
class ConverterTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("Celsius = " + MeasurementConverter.convertFahrenheitToCelsius(f));

        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Fahrenheit = " + MeasurementConverter.convertCelsiusToFahrenheit(c));

        System.out.print("Enter Pounds: ");
        double p = sc.nextDouble();
        System.out.println("Kilograms = " + MeasurementConverter.convertPoundsToKilograms(p));

        System.out.print("Enter Kilograms: ");
        double kg = sc.nextDouble();
        System.out.println("Pounds = " + MeasurementConverter.convertKilogramsToPounds(kg));

        System.out.print("Enter Gallons: ");
        double g = sc.nextDouble();
        System.out.println("Liters = " + MeasurementConverter.convertGallonsToLiters(g));

        System.out.print("Enter Liters: ");
        double l = sc.nextDouble();
        System.out.println("Gallons = " + MeasurementConverter.convertLitersToGallons(l));

        sc.close();
    }
}
