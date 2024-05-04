package DataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int tankMaxCapacityInLitters = 255;
        int tankCapacityInLitters = 0;

        for (int i = 0; i < n; i++) {
            int littersToAdd = Integer.parseInt(scanner.nextLine());

            if(tankCapacityInLitters<tankMaxCapacityInLitters) {
                if(littersToAdd+tankCapacityInLitters>tankMaxCapacityInLitters) {
                  System.out.println("Insufficient capacity!");
                    continue;
              }
                tankCapacityInLitters += littersToAdd;
            }

        }

        System.out.println(tankCapacityInLitters);
    }
}