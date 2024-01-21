package programming_skills;

import java.util.Arrays;

public class ArithmeticProgression {
    public static void main(String[] args) {
        System.out.println(canMakeArithmeticProgression(new int[]{1, 2, 4}));
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length == 0) return true;

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int diff = arr[1] - arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != diff) {
                return false;
            }
        }

        return true;
    }
}
