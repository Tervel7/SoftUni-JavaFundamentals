package ArrayListProjects;

import java.util.ArrayList;
import java.util.List;

public class ArraySwitchElements {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        swapElements(numbers, 3, 4);

        System.out.println(numbers);
    }

    private static void swapElements(List<Integer> numbers, int i, int j) {
        Integer iIndex = numbers.indexOf(i);
        Integer jIndex = numbers.indexOf(j);

        numbers.remove(numbers.indexOf(i));
        numbers.remove(numbers.indexOf(j));

        numbers.add(iIndex, j);
        numbers.add(jIndex, i);
    }
}
