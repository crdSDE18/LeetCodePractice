package leetcode;

public class MaxSubArray {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}; //6
        int[] nums2 = new int []{5,4,-1,7,8}; //23
        int[] nums3 = new int []{-2,-1}; //-1
        int[] nums4 = new int[]{1};

        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArray(nums2));
        System.out.println(maxSubArray(nums3));
        System.out.println(maxSubArray(nums4));
    }


    private static int maxSubArray(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int startWindow = 0;
        int currentSum = 0;

        for(int endWindow = 0; endWindow<nums.length; endWindow++) {
            currentSum += nums[endWindow];
            if (currentSum >= maxSum) {
                maxSum = Math.max(maxSum, currentSum);}
            while(currentSum< 0){
                currentSum -= nums[startWindow]; //remove the first element of the window out
                startWindow++;//slide the window
            }
        }

        return maxSum;
    }
}
