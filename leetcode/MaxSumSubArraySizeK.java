package leetcode;

import java.util.Arrays;

public class MaxSumSubArraySizeK {

    public static void main(String[] args){
        int[] nums = new int[]{2,1,3,1,9,0};
        int K = 3;

        System.out.println((maxSumSubArray(nums,K)));

    }

    public static int maxSumSubArray(int[] nums, int K) {
        int maxSum = 0;
        int currentSum = 0;
        int startWindow = 0;
        for (int endWindow = 0; endWindow < nums.length; endWindow++) {
            currentSum += nums[endWindow];

            if (endWindow >= K - 1){
                    maxSum = Math.max(maxSum,currentSum);
                    currentSum -= nums[startWindow]; //remove the first element of the window out
                    startWindow++;//slide the window
                }
            }

        return maxSum;
    }
}
