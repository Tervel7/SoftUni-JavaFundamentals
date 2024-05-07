import java.util.Arrays;
import java.util.Scanner;

//Searches for the best DNA provided.
//The best DNA formula is the one with the longest subsequence of 1.
//If there are several sequences with the same length of subsequence of 1, print the one with the leftmost starting index.
//If there are several sequences with the same length and starting index, select the sequence with the greater sum of its elements.
//There's a mandatory length for the DNA formula, which is stated in the
//begging of the code and the DNA formulas will have to be that exact length
//The DNA formula will be given with its numbers separated with "!"
//DNA formula with the length of 5 will look like this {1!0!1!1!0} or {0!1!1!0!0}
//After the command "Clone them", prints the best DNA formula

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the DNA length: ");
        int mandatoryLength = Integer.parseInt(scanner.nextLine());

        System.out.print("dna: ");
        String dna = scanner.nextLine();

        String bestDNA = "";
        int maxDNALength = 0;

        int bestPosition = 0;
        int currPosition = 0;

        int maxSum = 0;
        int currSum = 0;

        while(!(dna.equals("Clone them!"))) {

            boolean checkLength = checkLength(dna,mandatoryLength);

            if(!checkLength) {
                System.out.print("Wrong length, try again: ");
                dna = scanner.nextLine();
            } else {
                String[] dnaArr = clearStringAndPassToArray(dna);

                for (String i : dnaArr) {

                    currPosition = indexInStringArray(dnaArr, i);
                    currSum = getSumOfStringArray(dnaArr);

                    if (i.length() > maxDNALength) {
                        maxDNALength = i.length();
                        bestDNA = dna;
                        bestPosition = currPosition;
                        maxSum = currSum;
                    } else if (i.length() == maxDNALength) {
                        if (currPosition < bestPosition) {
                            bestDNA = dna;
                            maxSum = currSum;
                        } else if (currPosition == bestPosition) {
                            if (currSum > maxSum) {
                                bestDNA = dna;
                                maxSum = currSum;
                            }
                        }
                    }
                }
                System.out.print("dna: ");
                dna = scanner.nextLine();
            }
        }

        System.out.println("The best dna formula from all is: " + bestDNA);
    }

    private static boolean checkLength(String dna, int length) {
        String dnaOnlyNumbers = dna.replace("!","");
        if(dnaOnlyNumbers.length()>length || dnaOnlyNumbers.length()<length) {
            return false;
        } else return true;
    }

    static int getSumOfStringArray(String[] arr) {
        int summ = 0;
        for(String s : arr) {
            summ += Integer.parseInt(s);
        }
        return summ;
    }

    static String[] clearStringAndPassToArray(String s) {

        String dnaOnlyNumbers = s.replace("!","");
        String[] dnaArr = dnaOnlyNumbers.split("0");
        dnaArr = Arrays.stream(dnaArr)
                .filter(str -> !str.isEmpty())
                .toArray(String[]::new);

        return dnaArr;
    }

    static int indexInStringArray(String[] arr, String s) {
        int currPosition = -1;
        for(int j=0; j<=arr.length-1;j++) {
            if (arr[j].equals(s))
                currPosition = j;
        }
        return currPosition;
    }

}
