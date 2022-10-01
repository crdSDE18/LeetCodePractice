package leetcode;

public class BestTimeToBuySell {

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};//5
        int[] prices2 = new int[]{1,2};//1
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices2));
    }

    private static int maxProfit(int[] nums) {
        int maxProfit = 0;
        int windowStart = 0;

        for(int windowEnd=0; windowEnd<nums.length; windowEnd++) {
            maxProfit = Math.max(maxProfit, nums[windowEnd] - nums[windowStart]);

            if(nums[windowEnd] < nums[windowStart]) {
                windowStart = windowEnd;
            }
        }

        return maxProfit;

    }
}
