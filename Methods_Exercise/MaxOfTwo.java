package MethodsExercises;

import java.util.Scanner;

//Gets the type and give you the max from the two variables
//int, char, String only

public class MaxOfTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        if(type.equals("int")) {
            System.out.println(maxOfTwoNumbersInString(a,b));
        }

        if (type.equals("char")) {
            System.out.println(maxOfTwoCharsInString(a,b));
        }

        if(type.equals("String")) {
            System.out.println(maxOfTwoStrings(a,b));
        }

    }
    static String maxOfTwoNumbersInString(String a, String b) {
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        if(aInt>bInt)
            return String.valueOf(aInt);
        else if(bInt>aInt)
            return String.valueOf(bInt);
        else
            return "equal";
    }

    static String maxOfTwoCharsInString(String a, String b) {
        char aChar = a.charAt(0);
        char bChar = b.charAt(0);
        if(aChar>bChar)
            return String.valueOf(aChar);
        else if(bChar>aChar)
            return String.valueOf(bChar);
        else
            return "equal";
    }

    static String maxOfTwoStrings(String a, String b) {
        if(a.length()>b.length())
            return a;
        else if(b.length()>a.length())
            return b;
        else
            return "equal";
    }
}
