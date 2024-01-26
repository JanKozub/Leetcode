package programming_skills;

public class BasketballCourse {
    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"1","C"}));
    }

    public static int calPoints(String[] operations) {
        int[] record = new int[operations.length];
        int idx = 0;

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "+" -> record[idx] = record[idx - 1] + record[idx - 2];
                case "D" -> record[idx] = record[idx - 1] * 2;
                case "C" -> {
                    record[idx - 1] = 0;
                    idx -= 2;
                }
                default -> record[idx] = Integer.parseInt(operations[i]);
            }
            idx++;
        }

        int result = 0;
        for (int n : record) result += n;

        return result;
    }
}
