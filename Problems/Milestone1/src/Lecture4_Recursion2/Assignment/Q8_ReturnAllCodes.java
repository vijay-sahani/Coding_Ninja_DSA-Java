package Lecture4_Recursion2.Assignment;
/*
Return all codes - String
Send Feedback
Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to return the list of all possible codes that can be generated from the given string.
Note : The order of codes are not important. And input string does not contain 0s.
Input format :
A numeric string
Constraints :
1 <= Length of String S <= 10
Sample Input:
1123
Sample Output:
aabc
kbc
alc
aaw
kw
 */
public class Q8_ReturnAllCodes {
    public static String[] getCode(String input) {
        return getCode(input, "");
    }

    public static String[] getCode(String input, String out) {
        if (input.length() == 0) {
            return new String[]{out};
        }
        String[] sm = getCode(input.substring(1), out + input.charAt(0));
        String[] ans = new String[sm.length + 1];
        int i = 0;
        for (; i < sm.length; i++) {
            ans[i] = sm[i];
        }
        if (input.length() >= 2) {
            int l1 = input.charAt(0) - '0';
            int l2 = input.charAt(1) - '0';
            int num = l1 * 10 + l2;
            if (num >= 10 && num <= 26) {
                ans[i] = sm[i - 1] + input.charAt(0) + input.charAt(1);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        for (String str : getCode("1123")) {
            System.out.println(str);
        }
//        printCode("1123", "");
    }

    public static char helper(int asciVal) {
        return (char) (asciVal + 96);
    }


}