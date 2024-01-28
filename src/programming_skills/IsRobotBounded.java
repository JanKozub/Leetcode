package programming_skills;

public class IsRobotBounded {
    public static void main(String[] args) {

    }

    public boolean isRobotBounded(String instructions) {
        char[] steps = instructions.toCharArray();
        int direction = 0; // 0-NORTH, 1-WEST, 2-SOUTH, 3-EAST
        int[] cords = {0, 0};

        do {
            for (char step : steps) {
                switch (step) {
                    case 'R' -> direction++;
                    case 'L' -> direction--;
                    case 'G' -> {
                        switch (direction) {
                            case 0 -> cords[0]++;
                            case 1 -> cords[1]++;
                            case 2 -> cords[0]--;
                            case 3 -> cords[1]--;
                        }
                    }
                }

                if (direction < 0) direction = 3;
                else if (direction > 3) direction = 0;
            }
        } while (direction != 0);

        return cords[0] == 0 && cords[1] == 0;
    }
}
