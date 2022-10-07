package leetcode;

public class FindSecondMax {

    public static void main(String[] args) {
        int arr[] = {1, 4,6, 7, 2, 9};
        System.out.println(findSecondMax(arr));
    }

    private static int findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num:arr){
            if(num> max){
                secondMax = max;
                max = num;
            }
            else if(num>secondMax && num !=max){
                secondMax = num;
            }
        }return secondMax;
    }
}
