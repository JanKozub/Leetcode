package programming_skills;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public static void main(String[] args) {
        System.out.println(findMissingRanges(new int[]{}, 1, 1));
    }

    public static List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length == 0) {
            List<Integer> list = new ArrayList<>();
            list.add(lower);
            list.add(upper);

            result.add(list);

            return result;
        }

        if (lower < nums[0]) result.add(createRange(lower, nums[0] - 1));

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) continue;

            result.add(createRange(nums[i] + 1, nums[i + 1] - 1));
        }

        if (nums[nums.length - 1] < upper) result.add(createRange(nums[nums.length - 1] + 1, upper));

        return result;
    }

    private static List<Integer> createRange(int lower, int upper) {
        List<Integer> list = new ArrayList<>();
        list.add(lower);
        list.add(upper);

        return list;
    }
}
