package ArrayListProjects;

public class IsTop {
    public static void main(String[] args) {

        int[] numbers = {1, 4, 3, 2};
        boolean isTop = false;

        for(int i : numbers) {
            for(int j = i; j<=numbers.length-1; j++) {
                if (i>=numbers[j]) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
         }
            System.out.println(isTop? i + " is top integer" : i + " is not a top integer");
        }
    }
}
