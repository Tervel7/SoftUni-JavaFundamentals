package HashMapExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {

        Map<String, Integer> resources = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        String resource = scanner.nextLine();

        while(!(resource.equals("end"))){
            int quantity = Integer.parseInt(scanner.nextLine());
            resources.putIfAbsent(resource,0);
            resources.put(resource, resources.get(resource)+quantity);

            resource = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
