package MethodsExercises;

import java.util.Scanner;

// Checks if the password is between 6 and 10 symbols.
// Checks if its digits and letters only.
// Checks if you have at least two digits in the password.

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.next();

        System.out.println(checkPassword(pass));
    }

    private static boolean checkPassword(String s) {
        boolean lengthCheck = lengthCheck(s);
        boolean numberOrLetterCheck = numberOrLetterCheck(s);
        boolean numbersCheck = digitContentCheck(s);


        return lengthCheck && numberOrLetterCheck && numbersCheck;
    }


    static boolean lengthCheck(String s) {
        if (s.length()<6 || s.length()>10) {
            System.out.println("Your password it outside the frame. Keep it between 6 and 10 letters and digits!");
            return false;
        }
        else return true;
    }

    static boolean numberOrLetterCheck(String s) {
        boolean numberOrLetterCheck = false;

        for (int i = 0; i <= s.length() - 1; i++) {

            numberOrLetterCheck = false;
            boolean isANumber = false;
            boolean isALetter = false;

            isALetter = Character.isLetter(s.charAt(i));
            isANumber = Character.isDigit(s.charAt(i));

            if (isALetter || isANumber) {
                numberOrLetterCheck = true;
            } else {
                System.out.println("Password contains invalid character!");
                return false;
            }
        }
        return numberOrLetterCheck;
    }
    private static boolean digitContentCheck(String s) {
        int digitCounter = 0;

        for(int i =0; i<=s.length()-1;i++) {
            if (Character.isDigit(s.charAt(i)))
                digitCounter++;
        }
        if (digitCounter>=2)
            return true;
        else{
            System.out.println("You must have at lest two digits!");
            return false;
        }
    }
}
