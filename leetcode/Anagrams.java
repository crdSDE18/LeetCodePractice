package leetcode;

public class Anagrams {

    public static void main(String[] args) {
        String a = "bac";
        String b = "abc";
        System.out.println(isAnagram(a, b));
    }

    public static boolean isAnagram(String s, String t) {
        int[] letters = new int[26];

        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            letters[t.charAt(i) - 'a']++;
        }

        for (int count : letters) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}