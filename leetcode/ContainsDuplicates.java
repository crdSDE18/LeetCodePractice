package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

    public static void main(String[] args){

        int[] nums = new int[]{1,2,3,1};
        System.out.println(hasDuplicates(nums));
    }

    private static boolean hasDuplicates(int[] nums){
        Set<Integer> dup = new HashSet<>();

        for(int num:nums){
            if(!dup.contains(num)){//set thereom - no duplicates, so if it can't be added it must already exists in set
                return true;
            }
        }return false;
    }
}
