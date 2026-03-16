package gla.com.ClassAndObject.level2;

import java.util.Scanner;

class PalindromeChecker {

    String text;
    boolean isPalindrome() {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        if (text.equalsIgnoreCase(reversed)) {
            return true;
        } else {
            return false;
        }
    }
    void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text is a Palindrome.");
        } else {
            System.out.println("The text is NOT a Palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PalindromeChecker obj = new PalindromeChecker();

        System.out.print("Enter text: ");
        obj.text = sc.nextLine();

        obj.displayResult();
    }
}

