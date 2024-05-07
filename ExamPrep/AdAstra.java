package ExamPrep;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {

    static class Food {
        String foodName;
        String expDate;
        int calories;

        Food(String foodName, String expDate, int calories) {
            this.foodName = foodName;
            this.expDate = expDate;
            this.calories = calories;
        }

        public String getFoodName() {
            return foodName;
        }

        public String getExpDate() {
            return expDate;
        }

        public int getCalories() {
            return calories;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        int caloriesSum = 0;

        Map<String, Food> foods = new HashMap<>();
        List<Food> foodsArr = new ArrayList<>();

        Pattern pattern = Pattern.compile("([#|]{1})(?<food>[A-Za-z\\s]+)\\1(?<expirationDate>\\d{2}/\\d{2}/\\d{2})\\1(?<calories>\\d{1,5})\\1");
        Matcher matcher = pattern.matcher(line);

        while(matcher.find()) {
            foods.put(matcher.group("food"),new Food(matcher.group("food"), matcher.group("expirationDate"), Integer.parseInt(matcher.group("calories"))) );
        }

        for(Map.Entry<String, Food> entry : foods.entrySet()) {
            System.out.print("Item: " + entry.getValue().getFoodName());
            System.out.print(" Best before: " + entry.getValue().getExpDate());
            System.out.print(" Nutrion: " + entry.getValue().getCalories());
            System.out.println();
            caloriesSum += entry.getValue().calories;
        }
        System.out.println("You have food left for " + caloriesSum/2000 + " days");
    }
}
