package programming_skills;

public class IsMonotonic {

    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1, 2, 2, 3}));
    }

    public static boolean isMonotonic(int[] nums) {
        int type = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                if (type == 0) type = 1;
                else if (type == -1) return false;
            } else if (nums[i] > nums[i + 1]) {
                if (type == 0) type = -1;
                else if (type == 1) return false;
            }
        }

        return true;
    }
}
