package com.gla.String.level2;

import java.util.Scanner;

public class WordLength2DArray {
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
    public static String[] splitWords(String text) {
        int len = findLength(text);
        String word = "";
        String[] temp = new String[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);

            if (ch != ' ') {
                word = word + ch;
            } else {
                temp[index] = word;
                index++;
                word = "";
            }
        }

        temp[index] = word;
        index++;

        String[] words = new String[index];
        for (int i = 0; i < index; i++) {
            words[i] = temp[i];
        }

        return words;
    }
    public static String[][] wordLengthArray(String[] words) {
        int size = words.length;
        String[][] result = new String[size][2];

        for (int i = 0; i < size; i++) {
            result[i][0] = words[i];
            int len = findLength(words[i]);
            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] result = wordLengthArray(words);

        System.out.println("\nWord\tLength");
        for (int i = 0; i < result.length; i++) {
            int length = Integer.parseInt(result[i][1]);
            System.out.println(result[i][0] + "\t" + length);
        }
    }
}
