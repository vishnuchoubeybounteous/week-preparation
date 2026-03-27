package DSA_Day4;

public class Ques7 {
    public static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right)) return false;
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(s + " is palindrome: " +
            isPalindrome(s, 0, s.length() - 1));
    }

}
