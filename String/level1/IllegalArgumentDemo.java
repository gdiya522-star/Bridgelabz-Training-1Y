package com.gla.String.level1;

import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generateException(String text) {
        String result = text.substring(2,5);
        System.out.println(result);
    }
    public static void handleException(String text) {
        try {
            String result = text.substring(2,5);
            System.out.println(result);
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled: " + e);
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException handled: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();


        generateException(text);

        handleException(text);
    }
}

