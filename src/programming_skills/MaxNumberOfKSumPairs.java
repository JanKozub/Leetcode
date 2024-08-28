package programming_skills;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{1, 2, 3, 4}, 5));
    }

    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int a = 0, b = nums.length - 1, maxOperations = 0;

        while (a < b) {
            int val = nums[a] + nums[b];
            if (val == k) {
                maxOperations++;
                a++;
                b--;
            } else if (val < k) {
                a++;
            } else {
                b--;
            }
        }
        return maxOperations;
    }
}
