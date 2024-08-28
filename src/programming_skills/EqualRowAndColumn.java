package programming_skills;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EqualRowAndColumn {
    public static void main(String[] args) {
        System.out.println(equalPairs(new int[][]{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}}));
    }

    public static int equalPairs(int[][] grid) {
        Set<int[]> rows = new HashSet<>(Arrays.stream(grid).toList());
        Set<int[]> cols = new HashSet<>();

        for (int i = 0; i < grid.length; i++) {
            int[] col = new int[grid.length];

            for (int j = 0; j < grid[i].length; j++) {
                col[j] = grid[j][i];
            }
            cols.add(col);
        }

        int counter = 0;

        for (int[] row : rows) {
            for (int[] col : cols) {
                if (Arrays.equals(row, col)) {
                    counter++;
                }
            }
        }

        return counter;
    }
}
