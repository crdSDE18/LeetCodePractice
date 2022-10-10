package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SubSets {

    public static void main(String[] args) {
        int[] a = {1, 3,5};
        System.out.println(findSubsets(a));
    }

    private static List<List<Integer>> findSubsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        //empty subset
        subsets.add(new ArrayList<>());
        for (int currNum : nums) {
            int n = subsets.size();
            for (int i = 0; i < n; i++) {
                List<Integer> set = new ArrayList<>(subsets.get(i));
                set.add(currNum);
                subsets.add(set);
            }
        }

        return subsets;
    }
}