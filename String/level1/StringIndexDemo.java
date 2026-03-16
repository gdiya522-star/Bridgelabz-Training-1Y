package com.gla.String.level1;

import java.util.Scanner;

public class StringIndexDemo {

    public static void generateException(String text) {
        System.out.println("Generating Exception...");
        char ch = text.charAt(text.length());   // invalid index
        System.out.println(ch);
    }
    public static void handleException(String text) {
        try {
            System.out.println("Handling Exception...");
            char ch = text.charAt(text.length());   // invalid index
            System.out.println(ch);
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Program stopped due to exception.");
        }
        handleException(text);
    }
}

