package com.gla.String.level2;

import java.util.Scanner;

public class SplitTextCompare {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] splitText(String text) {
        int len = findLength(text);

        int words = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }

        String[] result = new String[words];
        int start = 0;
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                result[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        result[index] = text.substring(start, len);

        return result;
    }
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();
        String[] myWords = splitText(text);
        String[] splitWords = text.split(" ");
        System.out.println("\nWords using user method:");
        for (String w : myWords) {
            System.out.println(w);
        }

        System.out.println("\nWords using split() method:");
        for (String w : splitWords) {
            System.out.println(w);
        }
        boolean result = compareArrays(myWords, splitWords);

        System.out.println("\nAre both results same? " + result);

        sc.close();
    }
}
