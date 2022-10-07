package leetcode;

public class validPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama"; // true O(n) solution
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s){
    char[] arr = s.toCharArray();
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
        while (left < right && !Character.isLetterOrDigit(arr[left])) {
            left++;
        }
        while (left < right && !Character.isLetterOrDigit(arr[right])) {
            right--;
        }
        if (Character.toLowerCase(arr[left]) != Character.toLowerCase(arr[right])) return false;
        left++;
        right--;
    }
        return true;
    }
}
