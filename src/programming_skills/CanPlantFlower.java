package programming_skills;

public class CanPlantFlower {
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 2));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        if (flowerbed.length == 1 && flowerbed[0] == 0 && n == 1) return true;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (i > 0 && flowerbed[i - 1] != 1 && i < flowerbed.length - 1 && flowerbed[i + 1] != 1) {
                    flowerbed[i] = 1;
                    n--;
                } else if (flowerbed.length > 1) {
                    if (i == 0 && flowerbed[1] == 0) {
                        flowerbed[0] = 1;
                        n--;
                    } else if (i == flowerbed.length - 1 && flowerbed[i - 1] == 0) {
                        flowerbed[flowerbed.length - 1] = 1;
                        n--;
                    }
                }

                if (n == 0) return true;
            }
        }

        return false;
    }
}
