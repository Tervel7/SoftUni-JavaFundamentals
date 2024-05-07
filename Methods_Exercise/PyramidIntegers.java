import java.util.Scanner;

public class PyramidIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int topInt = 5;

        for(int i =1; i<=topInt; i++) {
            for (int j = 1; j<=i; j++)
                System.out.print(j);
            System.out.println();
        }

        for(int i=topInt-1; 1<=i; i--) {
            for (int j = 1; j<=i; j++)
                System.out.print(j);
            System.out.println();
        }

        System.out.println();

        pyramid(5);

    }

    static void printNumbers(int x) {
        for (int i =1; i<=x; i++) {
            System.out.print(i + " ");
        }
    }

    static void pyramid(int x) {
        for (int i=1; i<=x; i++) {
            printNumbers(i);
            System.out.println();
        }

        for (int i =x-1; i>=1; i--) {
            printNumbers(i);
            System.out.println();
        }
    }
}
