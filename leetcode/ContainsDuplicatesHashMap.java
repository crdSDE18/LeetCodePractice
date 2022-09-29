package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicatesHashMap {

    public static void main(String[] args){
    int[] nums = new int[]{1,2,3,1};
    System.out.println(hasDuplicates(nums));
}

    private static boolean hasDuplicates(int[] nums){
        HashMap<Integer,Integer> dups = new HashMap<>();
        for(int num:nums){
            if(dups.containsKey(num)){
                return true;

            }
            else{
                dups.put(num,1);
            }
        }return false;
    }

}
