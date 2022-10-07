package leetcode;

import java.util.Arrays;

public class RotateArrayByLastIndex {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};//end result = [5,1,2,3,4]
        rotateArrayLastIndex(arr);

        System.out.println(Arrays.toString(arr));
}

    private static void rotateArrayLastIndex(int[] nums) {
        int lastElement = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = lastElement;
    }
}
