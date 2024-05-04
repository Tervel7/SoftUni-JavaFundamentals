package DataTypesAndVariables;

import java.util.Scanner;

public class PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char c = (char)Integer.parseInt(scanner.nextLine());
        char c2 = (char)Integer.parseInt(scanner.nextLine());

        for (char i = c; i<=c2; i++)
            System.out.print(i + " ");
    }
}
