package leetcode;

public class SignOfProductArraySecondApproach {

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
       int positive = 0; int negative = 0;
       int end = nums[nums.length -1];
        for(int i= 0; i<nums.length; i++){
          if(nums[i] == 0){
              return 0;
          }
          else if(nums[i]<0){
              negative++;
          }
          else{
              positive ++;
          }
       }
        if((positive == negative && end >0) || negative%2 ==0){
            return 1;
        }
        else{
            return -1;
        }
}


}
