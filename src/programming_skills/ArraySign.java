package programming_skills;

public class ArraySign {

    public static void main(String[] args) {
        //System.out.println(arraySign(new int[]{7, 36, 96, 70, 85, 23, 5, 18, 4, 12, 89, 92, 9, 30, 53, 14, 96, 32, 13, 43, 37, 60, 75, 7, 83, 68, 20, 8, -24, -80, -27, -92, -96, -20, -16, -52, -49, -38}));
        System.out.println(arraySign(new int[]{-1,-2,-3,-4,3,2,1}));
    }

    public static int arraySign(int[] nums) {
        if (nums[0] == 0) return 0;

        int sign = 1;
        if (nums[0] < 0) sign = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) return 0;

            if (nums[i] < 0) {
                if (sign == 1) sign = -1;
                else sign = 1;
            }
        }

        return sign;
    }
}
