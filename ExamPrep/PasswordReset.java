package ExamPrep;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String command = scanner.nextLine();

        while(!(command.equals("Reveal"))) {
            String[] commandParts =  command.split(":\\|:");

            switch(commandParts[0]) {
                case "InsertSpace":
                    message = handleInsertSpace(message, Integer.parseInt(commandParts[1]));
                    break;
                case "Reverse":
                    message = handleReverse(message,commandParts[1]);
                    if(message.equals(null)){
                        System.out.println("error");
                        break;
                    }
                    break;
                case "ChangeAll":
                    message = handleChangeAll(message,commandParts[1],commandParts[2]);
                    break;
                default:
                    System.out.println("Invalid command");
            }
            command=scanner.nextLine();
        }
        System.out.println(message);
    }

    private static String handleChangeAll(String message, String substring, String replacement) {
        return message.replace(substring,replacement);
    }

    private static String handleReverse(String message, String reverse) {
        if(message.contains(reverse)) {
            String firstPart = message.substring(0,message.indexOf(reverse));
            String secondPart = message.substring(message.indexOf(reverse)+reverse.length());
            return firstPart + secondPart + reverseString(reverse);
        }
        return null;
    }

    private static String reverseString(String reverse) {
        StringBuilder reversedString = new StringBuilder();
        for (int i =0;i<reverse.length();i++) {
            reversedString.insert(0,reverse.charAt(i));
        }
        return reversedString.toString();
    }

    private static String handleInsertSpace(String message, int index) {
        String firstPart = message.substring(0,index);
        String secondPart = message.substring(index);
        return firstPart + " " + secondPart;
    }
}
