package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class RearrangeNevPositiveElements {

    public static void main(String[] args) {
        int[] arr = {10, -1, 20, 4, 5, -9, -6};
        System.out.println(Arrays.toString(reArrangeArray(arr)));

    }

    private static int[] reArrangeArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int temp = 0;
        while (left < right) {
            if (arr[left] > 0 && arr[left] > arr[right]) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            left++;
        }
            return arr;

    }
}