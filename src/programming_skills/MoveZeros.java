package programming_skills;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    public static void moveZeroes(int[] nums) {
        if (nums.length == 1)
            return;

        int c = 0;
        for (int i = 0; i + c < nums.length; i++) {
            if (nums[i] == 0) {
                while (nums[i + c] == 0) {
                    c++;

                    if (i + c >= nums.length)
                        return;
                }

                nums[i] = nums[i + c];
                nums[i + c] = 0;
            }

            System.out.println(Arrays.toString(nums));
        }
    }
}
