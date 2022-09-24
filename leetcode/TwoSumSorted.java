package leetcode;

import java.util.Arrays;

public class TwoSumSorted {

    public static void main(String[] args) {
        int[] nums = new int[]{11,12,15,7}; //sorted(7,11,12,15)
        int target = 23;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{0, 0};
    }


}
