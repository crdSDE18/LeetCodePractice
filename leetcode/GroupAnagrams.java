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
           String temp = sortString(s);
            if (!groups.containsKey(temp)) {
               groups.put(temp,new ArrayList<>());
               groups.get(temp).add(s);
            }
            else{
                groups.get(temp).add(s);
            }
        }return new ArrayList(groups.values());
    }


    private static String sortString(String s){
        char[]  a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
