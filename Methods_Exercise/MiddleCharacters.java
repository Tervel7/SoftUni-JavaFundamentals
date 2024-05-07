package MethodsExercises;

import java.util.Scanner;

//Prints the middle character of odd String, or prints the two middle characters of even String

public class MiddleCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myWord = scanner.nextLine();

        if(myWord.length()%2==0) {
            middleCharactersOfEvenLengthString(myWord);
        } else
            middleCharacterOfOddLengthString(myWord);

    }

    private static void middleCharactersOfEvenLengthString(String s) {
        System.out.print(s.charAt((s.length()/2)-1));
        System.out.print(s.charAt(s.length()/2));
    }

    private static void middleCharacterOfOddLengthString(String s) {
        System.out.println(s.charAt(s.length()/2));
    }
}
