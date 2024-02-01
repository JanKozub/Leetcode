package programming_skills;

public class StraightLine {
    public static void main(String[] args) {
        checkStraightLine(new int[][]{{1, 2}, {2, 3}});
    }

    public static boolean checkStraightLine(int[][] coordinates) {
        double a = 1, b = 1, c;
        int xDiff = (coordinates[0][0] - coordinates[1][0]);
        if (xDiff == 0) b = 0;
        else a = (double) (coordinates[0][1] - coordinates[1][1]) / xDiff;
        
        c = coordinates[0][1] - (a * coordinates[0][0]);



        for (int i = 2; i < coordinates.length; i++) {
            System.out.println(coordinates[i][0] + " " + coordinates[i][1] + " " + b);
            if (a * coordinates[i][0] + b * coordinates[i][1] + c != 0)
                return false;
        }

        return true;
    }
}
