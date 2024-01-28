package programming_skills;

public class DiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            if (i != mat.length - 1 - i)
                sum = sum + mat[i][mat.length - 1 - i];
            sum = sum + mat[i][i];

        }

        return sum;
    }
}
