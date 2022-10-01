package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumOptimized {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 5, 11};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    private static int[] twoSum(int[] nums,int target) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        int index = 0;
        int first_index = 0;
        for (int num : nums) {
            int difference = target - num;
            if (!numbers.containsKey(difference)) {
                numbers.put(num, index);
                index++;
            } else {
                first_index = numbers.get(difference);
                break;
            }
        }
        return new int[]{first_index, index};
    }
}