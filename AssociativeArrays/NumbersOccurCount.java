package HashMapExercises;

import java.util.HashMap;
import java.util.Map;

public class NumbersOccurCount {
    public static void main(String[] args) {
        double[] numbersArray = {8.0, 8.1, 2.4, 2.4, 8.0, 2.0};

        HashMap<Double, Integer> numbersOccur = new HashMap<>();

        for (double d : numbersArray) {
            if (!(numbersOccur.containsKey(d))) {
                numbersOccur.put(d, 1);
            } else {
                int j = numbersOccur.get(d);
                numbersOccur.put(d, j + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : numbersOccur.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

