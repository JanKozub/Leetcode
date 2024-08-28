package programming_skills;

public class BestTimeToBuyStock1 {
    public static void main(String[] args) {
        maxProfit(new int[]{3,5,1,7,8});
    }

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }

            maxProfit = Math.max(maxProfit, prices[i] - min);
        }

        return maxProfit;
    }
}
