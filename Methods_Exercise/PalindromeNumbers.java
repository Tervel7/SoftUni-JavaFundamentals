package MethodsExercises;

import java.util.Scanner;

public class PalindromeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int reverseX = reverseInt(x);

        if(x==reverseX) {
            System.out.println("Palindromes");
        } else
            System.out.println("Different");
    }

    private static int reverseInt(int x) {
        String number = String.valueOf(x);

        String numberReverseString = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            numberReverseString += number.charAt(i);
        }

        return Integer.parseInt(numberReverseString);
    }
}
