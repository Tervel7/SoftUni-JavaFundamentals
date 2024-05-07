package HashMapExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExplanation {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int lessThan = 4;

        List<Integer> numbersFiltered = numbers.stream()
                        .filter(number -> number<lessThan)
                        .collect(Collectors.toList());

        System.out.println(numbersFiltered);
    }

//    static ArrayList<Integer> filter(ArrayList<Integer> numbers, Condition condition) {
//        ArrayList filtered = new ArrayList<>();
//        for(int number:numbers) {
//            if (condition.check(number)) {
//                filtered.add(number);
//            }
//        }
//        return filtered;
//    }

}
