package leetcode;

public class SignOfTheProductOfAnArray{

    public static void main(String[] args) {

        int[] nums = new int[]{-1,-2,-3,-4, 3,2,1};
        int[] nums2 = new int[]{-1,-2,-3,-4,2,1};
        int[] nums3 = new int[]{-1,-2,-3,-4, 3,0,1};
        int[] nums4 = new int[]{-1,1,-1,1,1,-1};

        System.out.println(arraySign(nums));//1
        System.out.println(arraySign(nums2));//1
        System.out.println(arraySign(nums3));//0
        System.out.println(arraySign(nums4));//-1
    }

    private static int arraySign(int[] nums){
        int sign=1;
        for(int num: nums){
            if(num==0){
                return 0;
            }
            else if(num <0){
                sign=-sign;// sign changes everything there's a negative number
            }
        }
        return sign;
    }
}
