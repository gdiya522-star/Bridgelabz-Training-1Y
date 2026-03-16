package com.gla.String.level3;

import java.util.Scanner;

public class UniqueCharacters {



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

        public static char[] uniqueChars(String str) {
            int len = findLength(str);
            char[] temp = new char[len];
            int index = 0;

            for (int i = 0; i < len; i++) {
                char ch = str.charAt(i);
                boolean isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (ch == str.charAt(j)) {
                        isUnique = false;
                        break;
                    }
                }

                if (isUnique) {
                    temp[index] = ch;
                    index++;
                }
            }


            char[] result = new char[index];
            for (int i = 0; i < index; i++) {
                result[i] = temp[i];
            }

            return result;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String text = sc.nextLine();

            char[] unique = uniqueChars(text);

            System.out.println("Unique Characters:");
            for (int i = 0; i < unique.length; i++) {
                System.out.print(unique[i] + " ");
            }
        }
    }

