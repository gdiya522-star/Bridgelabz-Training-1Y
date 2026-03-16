package com.gla.String.level1;

public class NullPointerDemo {

    // Method to generate exception
    static void generateException() {
        String text = null;
        System.out.println(text.length());   // Exception here
    }

    // Method to handle exception
    static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {

        System.out.println("Handling Exception:");
        handleException();

    }
}
