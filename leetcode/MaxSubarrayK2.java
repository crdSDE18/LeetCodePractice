package leetcode;

public class MaxSubarrayK2{

    public static void main(String[] args) {

        int arr[] = {2, 1, 5, 1, 3, 2};
        int Sum=8;
        System.out.println(smallestSubArrayGreaterEqualSum(arr,Sum));
    }

      private static int smallestSubArrayGreaterEqualSum(int[] arr, int Sum){
          int maxSum = 0;
          int windowStart = 0;
          int currentSum =0;
          int length =Integer.MAX_VALUE;
          for(int windowEnd = 0;windowEnd<arr.length;windowEnd++){
            currentSum += arr[windowEnd];

            if(currentSum>=Sum){
              currentSum -= arr[windowStart];
              length= Math.min(length,windowEnd-windowStart);
              windowStart++;
            }

        }
          return length;
    }
}
