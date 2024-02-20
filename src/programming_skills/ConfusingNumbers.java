package programming_skills;

public class ConfusingNumbers {
    public static void main(String[] args) {
        System.out.println(confusingNumber(89));
    }

    public static boolean confusingNumber(int n) {
        int[][] trans = new int[][]{{1, 1}, {6, 9}, {8, 8}, {9, 6}};
        int result = 0, input = n;

        while (n > 0) {
            int num = n % 10;

            if (num == 2 || num == 3 || num == 4 || num == 5 || num == 7) return false;

            for (int[] a : trans) {
                if (num == a[0]) {
                    result = result + a[1];
                }
            }
            result *= 10;
            n = n / 10;
        }
        result /= 10;

        return result != input;
    }
}
