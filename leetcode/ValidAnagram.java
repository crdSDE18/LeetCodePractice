package leetcode;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s,t));//true
    }

        public static boolean isAnagram(String s, String t) {
            char[] t_array = t.toCharArray();
            char[] s_array = s.toCharArray();

            Arrays.sort(t_array);
            Arrays.sort(s_array);

           return Arrays.equals(t_array, s_array);
        }
}


