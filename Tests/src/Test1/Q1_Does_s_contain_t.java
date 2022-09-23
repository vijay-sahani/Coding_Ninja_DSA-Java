package Test1;

/*
Does s contain t ?
Send Feedback
Given two string s and t, write a function to check if s contains all characters of t (in the same order as they are in string t).
Return true or false.
Do it recursively.
E.g. : s = “abchjsgsuohhdhyrikkknddg” contains all characters of t=”coding” in the same order. So function will return true.
Input Format :
Line 1 : String s
Line 2 : String t
Output Format :
true or false
 */
public class Q1_Does_s_contain_t {
    public static boolean checkSequence(String a, String b) {
        if (b.length() == 0) return true;
        if (a.length() == 0) return false;
        if (a.charAt(0) == b.charAt(0)) {
            return checkSequence(a.substring(1), b.substring(1));
        }
        return checkSequence(a.substring(1), b);

    }

    public static void main(String[] args) {

        System.out.println(checkSequence("abchjsgsuohhdhyrikkknddg", "coding"));
    }
}
