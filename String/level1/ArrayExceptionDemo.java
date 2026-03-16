package com.gla.String.level1;

import java.util.Scanner;

public class ArrayExceptionDemo {
    static void generateException(String[] names) {
        System.out.println("Generating Exception...");
        System.out.println(names[names.length + 1]);
    }
    static void handleException(String[] names) {
        try {
            System.out.println("Handling Exception...");

            System.out.println(names[names.length + 1]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
        }
        catch (RuntimeException e) {
            System.out.println("Runtime Exception caught!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.nextLine();
        }

        generateException(names);

        handleException(names);
    }
}
