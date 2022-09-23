package Lecture3_Recursion1.Assignment;

/*
Check Palindrome (recursive)
Send Feedback
Check whether a given String S is a palindrome using recursion. Return true or false.
 */
public class CheckPalindrome {
    public static boolean isStringPalindrome(String input) {
        if (input.length() <= 1) return true;
        if (input.charAt(0) != input.charAt(input.length() - 1)) return false;
        return isStringPalindrome(input.substring(1, input.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(isStringPalindrome(""));
    }
}
/*
Test cases:
case1: racecar
case2: pablo
case3: naman
case4:""
 */