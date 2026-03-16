package com.gla.Method.Level3;

import java.util.Scanner;

public class NumberChecker {
    public static int countDigits(int number) {
        int count = 0;
        int n = number;
        if (n == 0) return 1;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    public static int[] getDigitsArray(int number) {
        int size = countDigits(number);
        int[] digits = new int[size];
        int n = number;
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return sum != 0 && number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int digit : digits) {
            freq[digit][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = getDigitsArray(number);

        System.out.println("Number of digits: " + countDigits(number));
        System.out.println("Digits array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad number? " + (isHarshadNumber(number, digits) ? "Yes" : "No"));

        System.out.println("Digit frequencies:");
        int[][] freq = digitFrequency(digits);
        System.out.println("Digit | Frequency");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("  " + freq[i][0] + "   |   " + freq[i][1]);
            }
        }

        sc.close();
    }
}
