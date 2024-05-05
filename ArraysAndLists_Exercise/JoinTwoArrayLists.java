package ArrayListProjects;

import java.util.ArrayList;

public class JoinTwoArrayLists {
    public static void main(String[] args) {
        ArrayList<String> words1 = new ArrayList<>();
        ArrayList<String> words2 = new ArrayList<>();

        words1.add("The");
        words1.add("Quick");
        words1.add("Brown");

        words2.add("Fox");
        words2.add("Jumps");
        words2.add("Over");

        ArrayList<String> combined = combineTwoLists(words1, words2);

        System.out.println(combined);
    }

    private static ArrayList<String> combineTwoLists(ArrayList<String> words1, ArrayList<String> words2) {
        for (int i =0; i<words2.size();i++) {
            words1.add(words2.get(i));
        }
        return words1;
    }
}
