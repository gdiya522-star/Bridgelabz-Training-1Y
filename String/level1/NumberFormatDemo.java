package com.gla.String.level1;

import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate the exception
    static void generateException(String text) {
        int num = Integer.parseInt(text);   // agar text number nahi hoga to exception aayega
        System.out.println("Number is: " + num);
    }

    // Method to handle the exception
    static void demonstrateException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number is: " + num);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: Input is not a valid number.");
        }
        catch (RuntimeException e) {
            System.out.println("Runtime Exception occurred.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // First call method to generate exception
        generateException(text);

        // Then call method to handle exception
        demonstrateException(text);
    }
}
