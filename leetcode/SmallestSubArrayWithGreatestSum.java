package leetcode;

public class SmallestSubArrayWithGreatestSum {

    public static void main(String[] args){
        int[] nums = new int[]{2,1,5,2,3,2};
        int sum = 7;

        System.out.println(smallestSubArrayGreatestSum(nums,sum));

    }

    private static int smallestSubArrayGreatestSum(int[] nums, int sum){
        int minLength = nums.length+1;
        int currentSum= 0;
        int windowStart =0;

        for(int windowEnd = 0; windowEnd<nums.length; windowEnd ++) {
            currentSum += nums[windowEnd];

            if(currentSum >= sum) {
                minLength = Math.min(minLength, windowEnd-windowStart +1);
                currentSum -= nums[windowStart];
                windowStart++;
            }
        }
        return minLength;
    }
}
