package HashMapExercises;

import java.util.*;

public class GatherItems {
    public static void main(String[] args) {

        Map<String, Integer> allCurrency = new LinkedHashMap<>();
        allCurrency.put("shards",0);
        allCurrency.put("fragments",0);
        allCurrency.put("motes",0);

        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");

        int index = 0;

        while(index<line.length) {
            int quantity = Integer.parseInt(line[index]);
            String type = line[index+1].toLowerCase();

            allCurrency.putIfAbsent(type,0);
            allCurrency.put(type, allCurrency.get(type)+quantity);

            if(type.equals("shards") && allCurrency.get(type)>=250){
                allCurrency.put(type, allCurrency.get(type)-250);
                System.out.println("Shadowmourne - Obtained by " + type);
                break;
            }

            if(type.equals("fragments") && allCurrency.get(type)>=250){
                allCurrency.put(type, allCurrency.get(type)-250);
                System.out.println("Valanyr - Obtained by " + type);
                break;
            }

            if(type.equals("motes") && allCurrency.get(type)>=250){
                allCurrency.put(type, allCurrency.get(type)-250);
                System.out.println("Dragonwrath - Obtained by " + type);
                break;
            }

            index+=2;
        }

        for (Map.Entry<String, Integer> entry : allCurrency.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
