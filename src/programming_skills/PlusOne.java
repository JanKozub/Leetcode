package programming_skills;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >=0;i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }

        int[] plusDigits = new int[digits.length + 1];
        plusDigits[0] = 1;
        return plusDigits;
    }
}
