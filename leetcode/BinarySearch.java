package leetcode;

public class BinarySearch {
    public static void main(String[] args) {
        int num[] = {1, 2, 6, 9, 10};//6 index 2
        int target = 6;
        boolean[] arr = {false,false,true,true,true};//find first true, index 2
        System.out.println(binarySearch(num,target));
        System.out.println(findBoundary(arr));
    }
    private static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
       while(left<=right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return mid;
            if (nums[mid]<target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private static int findBoundary(boolean[] arr) {
        int left = 0, right = arr.length - 1;
        int boolIndex = -1;
        while(left<=right) {
            int mid = left + (right - left) / 2;
            if(arr[mid]){
                boolIndex = mid;
                right = mid -1;
            } else {
               left = mid + 1;
            }
        }
        return boolIndex;
    }
}
