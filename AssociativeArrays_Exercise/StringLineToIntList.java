package HashMapExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringLineToIntList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split(" ");

        List<Integer> numbers = Arrays.stream(split)
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());

        System.out.println(numbers);
    }
}
