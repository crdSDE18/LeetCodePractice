package leetcode;

import java.util.HashMap;
import java.util.Map;

public class CanConstruct {

    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";//false

        System.out.println(canConstruct(ransomNote,magazine));
        String ransomNoteA = "aa";
        String ransomNoteB = "aab";//true

        System.out.println(canConstruct(ransomNoteA,ransomNoteB));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            char currentCharNote = ransomNote.charAt(i);
                map.put(currentCharNote, map.getOrDefault(currentCharNote, 1) + 1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            char currentCharMag = magazine.charAt(i);
            if (map.containsKey(currentCharMag)) {
                map.put(currentCharMag, map.get(currentCharMag) - 1);
                if (map.get(currentCharMag) == 1) {
                    map.remove(currentCharMag);
                }
            }
        }

        return map.isEmpty();
    }
}
