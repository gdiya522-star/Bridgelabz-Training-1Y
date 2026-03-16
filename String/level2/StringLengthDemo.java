package com.gla.String.level2;


import java.util.Scanner;

public class StringLengthDemo {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count); // character access
                count++;            // count increase
            }
        }
        catch (StringIndexOutOfBoundsException e) {
            // jab index out of range hoga tab exception ayega
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        int customLength = findLength(text);
        int actualLength = text.length();

        System.out.println("Length using user-defined method: " + customLength);
        System.out.println("Length using built-in method: " + actualLength);
    }
}
