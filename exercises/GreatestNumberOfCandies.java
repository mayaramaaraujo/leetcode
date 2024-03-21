package exercises;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        System.out.println(kidsWithCandies(candies, 3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maior = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maior) {
                maior = candies[i];
            }
        }

        List<Boolean> isGreater = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maior) {
                isGreater.add(true);
            } else {
                isGreater.add(false);
            }
        }

        return isGreater;
    }
}
