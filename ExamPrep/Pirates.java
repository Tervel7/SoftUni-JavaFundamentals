package ExamPrep;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {

    static class City {
        String name;
        int population;
        int gold;

        City(String name, int population, int gold) {
            this.name = name;
            this.population = population;
            this.gold = gold;
        }

        public boolean plunder (int populationKilled, int goldStolen) {
            this.gold -= goldStolen;
            this.population -= populationKilled;
            if(this.gold <= 0 || this.population<=0) {
                this.gold = 0;
                this.population = 0;
                System.out.println(this.name + " has been wiped of the map!");
                return true;
            } else {
                System.out.println(this.name + " plundered! " + this.gold + " gold stolen, " + this.population + " citizens killed.");
                return false;
            }
        }

        public void prosper (int goldProsper) {
            if (goldProsper<0){
                System.out.println("Gold added cannot be a negative number");
            } else {
                this.gold += goldProsper;
                System.out.println(goldProsper + " added to the city treasury. " + this.name + " now has " + this.gold + " gold");
            }
        }
    }

    public static void main(String[] args) {
        Map<String,City> cities = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();

        while(!(city.equals("Sail"))) {
            String[] cityDetails = city.split("[||]+");

            String cityName = cityDetails[0];
            int cityPopulation = Integer.parseInt(cityDetails[1]);
            int cityGold = Integer.parseInt(cityDetails[2]);

            if(cities.containsKey(cityName)) {
                cities.get(cityName).population += cityPopulation;
                cities.get(cityName).gold += cityGold;
            } else {
            cities.put(cityName, new City(cityName,cityPopulation,cityGold));
            }

            city = scanner.nextLine();
        }

        String commandLine = scanner.nextLine();

        while(!(commandLine.equals("End"))) {
            String[] commandParts = commandLine.split("=>");
            String command = commandParts[0];
            String cityName = commandParts[1];

            switch (command) {
                case "Plunder":
                    boolean isWiped = cities.get(cityName).plunder(Integer.parseInt(commandParts[2]),Integer.parseInt(commandParts[3]));
                    if(isWiped) {
                        cities.remove(cityName);
                    }
                    break;
                case "Prosper":
                    cities.get(cityName).prosper(Integer.parseInt(commandParts[2]));
                    break;
            }
            commandLine = scanner.nextLine();
        }

        System.out.println("Ahoy captain. There are " + cities.size() + " wealthy settlements to go to: ");
        for(Map.Entry<String,City> entry : cities.entrySet()) {
            System.out.println(entry.getValue().name + " -> Population: " + entry.getValue().population + " citizens, Gold: " + entry.getValue().gold + " kg");
        }
    }
}
