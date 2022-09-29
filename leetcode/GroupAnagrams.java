package leetcode;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strings = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        //output[["bat"],["nat","tan"],["ate","eat","tea"]]
        System.out.println(Arrays.toString(new List[]{groupAnagrams(strings)}));
    }

    private static List<List<String>> groupAnagrams(String[] strings){
        Map<String,List> groups = new HashMap<String,List>();

        for(String s: strings) {
            char[]  a = s.toCharArray();
            Arrays.sort(a);
            String sortedKey = String.valueOf(a);
            if (!groups.containsKey(sortedKey)) {
               groups.put(sortedKey,new ArrayList<>());
               groups.get(sortedKey).add(s);
            }
            else{
                groups.get(sortedKey).add(s);
            }
        }return new ArrayList(groups.values());
    }
}
