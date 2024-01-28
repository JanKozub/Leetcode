package programming_skills;

import java.util.Arrays;

public class AverageSalary {
    public double average(int[] salary) {
        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int val : salary) {
            if (val > max) {
                max = val;
            } else if (val < min) {
                min = val;
            }

            sum += val;
        }
        sum = sum - max - min;

        return (double) sum / (salary.length - 2);
    }
}
