package leetcode;

public class BestTimeToBuySell {

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};//5
        int[] prices2 = new int[]{1,2};//1
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices2));
    }

    private static int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int maxProfit = 0;
        int currentProfitToday = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lsf) {
                lsf = prices[i];
            }
            currentProfitToday = prices[i] - lsf;
            if (maxProfit < currentProfitToday) {
                maxProfit = currentProfitToday;
            }

        }
        return maxProfit;
    }
}
