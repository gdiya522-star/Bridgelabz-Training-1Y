package com.gla.String.level2;

import java.util.Scanner;

public class TrimSpaces {

    public static int[] findTrimIndexes(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        int[] indexes = {start, end};
        return indexes;
    }
    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }


    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string with spaces:");
        String text = sc.nextLine();


        int[] indexes = findTrimIndexes(text);


        String trimmedText = createSubstring(text, indexes[0], indexes[1]);

        String builtInTrim = text.trim();

        boolean result = compareStrings(trimmedText, builtInTrim);

        System.out.println("Text after manual trim: " + trimmedText);
        System.out.println("Text after built-in trim: " + builtInTrim);
        System.out.println("Are both results same? " + result);

        sc.close();
    }
}
