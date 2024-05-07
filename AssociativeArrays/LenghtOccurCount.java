package HashMapExercises;

import java.util.HashMap;
import java.util.Map;

public class LenghtOccurCount {
    public static void main(String[] args) {
        String[] words = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        //hashmap key-3 (3-letter words) value - the 3-letter words

        Map<Integer, String> wordsLenghtOccur = new HashMap<>();

        for (String s : words) {
            if (!(wordsLenghtOccur.containsKey(s.length()))) {
                wordsLenghtOccur.put(s.length(), s);
            } else {
                String j = wordsLenghtOccur.get(s.length());
                wordsLenghtOccur.put(s.length(), j.concat(", " + s));
            }
        }

        for (Map.Entry<Integer, String> entry : wordsLenghtOccur.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
