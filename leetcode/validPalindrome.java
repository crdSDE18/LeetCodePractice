package leetcode;

public class validPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama"; // true O(n) solution
        System.out.println(isPalindrome(s));
    }
//thoughts regex to remove all non letters
    private static boolean isPalindrome(String s){
    int left = 0;
    int right = s.length()- 1;
    while (left < right) {
        while (left <right && !Character.isLetterOrDigit(s.charAt(left))) {
            left++;
        }
        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
            right--;
        }
        if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
        left++;
        right--;
    }
        return true;
    }
}
