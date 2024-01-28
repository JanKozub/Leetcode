package programming_skills;

public class RichestCustomerWealth {
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {
        int max = 0, counter;

        for (int[] account : accounts) {
            counter =  0;
            for (int trans : account) {
                counter += trans;
            }
            if (counter > max) {
                max = counter;
            }
        }

        return max;
    }
}
