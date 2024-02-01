package programming_skills;

import java.util.Arrays;

public class LargestTriangle {
    public static void main(String[] args) {
        System.out.println(largestPerimeter(new int[]{3, 2, 3, 4}));
    }

    public static int largestPerimeter(int[] nums) {
        if (nums.length < 3) return 0;

        Arrays.sort(nums);
        int a,b,c;

        for (int ia = nums.length - 1; ia >= 2; ia--) {
            a = nums[ia];
            b = nums[ia - 1];
            c = nums[ia - 2];

            if ((a < b + c) && (b < a + c) && (c < a + b)) {
                return a + b + c;
            }
        }

        return 0;
    }
}
