package Lecture4_Recursion2;

import java.util.ArrayList;
import java.util.List;

public class KeypadCode {
    private static final String[] codes = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static String[] keypadCode(int n) {
        if (n == 0) {
            return new String[]{""};
        }
        String[] smallCode = keypadCode(n / 10);
        String code = codes[n % 10];
        String[] ans = new String[smallCode.length * code.length()];
        int k = 0;
        for (String s : smallCode) {
            for (int j = 0; j < code.length(); j++) {
                ans[k++] = s + code.charAt(j);
            }
        }
        return ans;
    }

    public static List<String> letterCombinations(String digits) { // Leetcode Problem 17
        if (digits.length() == 0) {
            List<String> s = new ArrayList<>();
            s.add("");
            return s;
        }
        List<String> smallCode = letterCombinations(digits.substring(1));
        String code = codes[digits.charAt(0) - '0'];
        List<String> ans = new ArrayList<>(smallCode.size() * code.length());
        int k = 0;
        for (String s : smallCode) {
            for (int j = 0; j < code.length(); j++) {
                if (ans.size() <= k) {
                    ans.add("");
                }
                ans.set(k++, code.charAt(j) + s);
            }
        }
        return ans;
    }

    /*
    Print Keypad Combinations Code
    Send Feedback
    Given an integer n, using phone keypad find out and print all the possible strings that can be made using digits of input n.
    Note : The order of strings are not important. Just print different strings in new lines.
    Input Format :
    Integer n
    Output Format :
    All possible strings in different lines
    Constraints :
    1 <= n <= 10^6
    Sample Input:
    23
    Sample Output:
    ad
    ae
    af
    bd
    be
    bf
    cd
    ce
    cf
     */
    public static void printKeypadCode(int num) {
        printKeypadCode(num, "");
    }

    public static void printKeypadCode(int num, String sub) {
        if (num == 0) {
            System.out.println(sub);
            return;
        }
        String code = codes[num % 10];
        for (int i = 0; i < code.length(); i++)
            printKeypadCode(num / 10, code.charAt(i) + sub);

    }


    public static void main(String[] args) {
        int n = 23;
        for (String code : keypadCode(n)) {
            System.out.println(code);
        }
//        System.out.println(letterCombinations("23"));
        printKeypadCode(n);
    }
}
