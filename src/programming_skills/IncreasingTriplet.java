package programming_skills;

public class IncreasingTriplet {

    public static void main(String[] args) {
        increasingTriplet(new int[]{1,5,0,4,1,3});
    }

    public static boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;

        int n1 = Integer.MAX_VALUE;
        int n2 = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n1 >= n) {
                n1 = n;
            } else if (n2 >= n) {
                n2 = n;
            } else {
                return true;
            }
        }

        return false;
    }
}
