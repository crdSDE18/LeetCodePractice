package leetcode;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int nums[] = {0, 0, 1, 1, 1, 2, 2};//3 0,1,2
        System.out.println(removeDups(nums));
    }

    private static int removeDups(int[] nums) {
        int left = 0;
        int n = nums.length;
        for (int right = 0; right < n; right++) {
            if (nums[right] != nums[left]) {
                left++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }

}


