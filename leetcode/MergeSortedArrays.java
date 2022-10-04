package leetcode;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {

        int arr[] = {1, 3, 4, 5};
        int arr2[] = {2, 6, 7, 8};

        System.out.println(Arrays.toString(mergeSortedArrays(arr, arr2)));
    }

    private static int[] mergeSortedArrays(int[] num, int[] num1) {
        int m = num.length;
        int n = num1.length;
        int result[] = new int[m + n];
        int i = 0, j = 0, index = 0;

        while (i < m && j < n) {//handles merging
            if (num[i] < num1[j]) {
                result[index++] = num[i++];
            } else {
                result[index++] = num1[j++];
            }
        }
        //handles whatever is left
        while (i < m) {
            result[index++] = num[i++];
        }

        while (j < n) {
            result[index++] = num1[j++];
        }

        return result;
    }
}

