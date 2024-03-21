package exercises;

public class Flowerbed {
    public static void main(String[] args) {
        int[] flowerbed = {0,0,1,0,0};
        System.out.println(canPlaceFlowers(flowerbed, 1));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        if (n == 0) {
            return true;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                count++;

                if(count == n) {
                    return true;
                }

                i++;
            }

        }

        return false;
    }
}
