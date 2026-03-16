package com.gla.String.level2;

import java.util.Scanner;

public class ShortestLongestWord {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static String[] splitText(String text) {

        int len = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int index = 0;
        String word = "";

        for (int i = 0; i < len; i++) {

            if (text.charAt(i) != ' ') {
                word = word + text.charAt(i);
            } else {
                words[index] = word;
                index++;
                word = "";
            }
        }

        words[index] = word;
        return words;
    }
    public static String[][] wordWithLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }
    public static int[] shortestLongest(String[][] arr) {

        int min = Integer.parseInt(arr[0][1]);
        int max = Integer.parseInt(arr[0][1]);

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {

            int length = Integer.parseInt(arr[i][1]);

            if (length < min) {
                min = length;
                minIndex = i;
            }

            if (length > max) {
                max = length;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[] words = splitText(text);

        String[][] wordLength = wordWithLength(words);

        int[] result = shortestLongest(wordLength);

        System.out.println("\nWords and Lengths:");
        for (int i = 0; i < wordLength.length; i++) {
            System.out.println(wordLength[i][0] + " : " + wordLength[i][1]);
        }

        System.out.println("\nShortest Word: " + wordLength[result[0]][0]);
        System.out.println("Longest Word: " + wordLength[result[1]][0]);
    }
}
