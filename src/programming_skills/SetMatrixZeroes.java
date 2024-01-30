package programming_skills;

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        setZeroes(new int[][]{  {0, 1, 2, 0},
                                {3, 4, 5, 2},
                                {1, 3, 1, 5}});
    }

    public static void setZeroes(int[][] matrix) {
        int[][] original = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++)
            original[i] = matrix[i].clone();

        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                if (original[i][j] == 0) {

                    for (int o = 1; o < matrix.length; o++) {
                        if (i + o < matrix.length)
                            matrix[i + o][j] = 0;
                        if (i - o >= 0)
                            matrix[i - o][j] = 0;
                    }

                    for (int o = 1; o < matrix[0].length; o++) {
                        if (j + o < matrix[0].length)
                            matrix[i][j + o] = 0;

                        if (j - o >= 0)
                            matrix[i][j - o] = 0;
                    }
                }
            }
        }
    }
}
