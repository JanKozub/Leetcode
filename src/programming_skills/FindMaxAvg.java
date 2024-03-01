package programming_skills;

public class FindMaxAvg {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        if (nums.length == k) {
            for (int j = 0; j < k; j++) {
                sum = sum + nums[j];
                System.out.println(j);
            }
        } else {
            int newSum = 0;

            for (int i = 0; i < nums.length - k; i++) {
                for (int j = 0; j < k; j++) {
                    newSum = newSum + nums[i + j];
                }

                if (newSum > sum) sum = newSum;
            }
        }

        return (double) sum / k;
    }
}
