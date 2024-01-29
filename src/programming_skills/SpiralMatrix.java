package programming_skills;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {

        System.out.println(spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int size = matrix.length * matrix[0].length;
        int x = 0, y = 0, counter = 0;

        while (counter != size) {
            while (x < matrix[y].length && matrix[y][x] != -101) {
                result.add(matrix[y][x]);
                matrix[y][x] = -101;

                counter++;
                x++;
            }
            x--;
            y++;

            while (y < matrix.length && matrix[y][x] != -101) {
                result.add(matrix[y][x]);
                matrix[y][x] = -101;

                counter++;
                y++;
            }
            y--;
            x--;

            while (x >= 0 && matrix[y][x] != -101) {
                result.add(matrix[y][x]);
                matrix[y][x] = -101;

                counter++;
                x--;
            }
            x++;
            y--;

            while (y >= 0 && matrix[y][x] != -101) {
                result.add(matrix[y][x]);
                matrix[y][x] = -101;

                counter++;
                y--;
            }
            y++;
            x++;
        }

        return result;
    }
}
