package com.gla.String.level3;

import java.util.Scanner;

public class CharacterFrequency {



        public static int[][] findFrequency(String text) {

            int[] freq = new int[256];


            for (int i = 0; i < text.length(); i++) {
                freq[text.charAt(i)]++;
            }


            int count = 0;
            for (int i = 0; i < 256; i++) {
                if (freq[i] > 0) {
                    count++;
                }
            }


            int[][] result = new int[count][2];

            int index = 0;


            for (int i = 0; i < 256; i++) {
                if (freq[i] > 0) {
                    result[index][0] = i;
                    result[index][1] = freq[i];
                    index++;
                }
            }

            return result;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String text = sc.nextLine();

            int[][] frequency = findFrequency(text);

            System.out.println("Character Frequencies:");

            for (int i = 0; i < frequency.length; i++) {
                char ch = (char) frequency[i][0];
                int freq = frequency[i][1];
                System.out.println(ch + " : " + freq);
            }
        }
    }

