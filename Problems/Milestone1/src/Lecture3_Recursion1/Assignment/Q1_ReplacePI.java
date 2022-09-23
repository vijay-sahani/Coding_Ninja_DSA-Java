package Lecture3_Recursion1.Assignment;
/*
Replace pi (recursive)
Send Feedback
Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
 */
public class Q1_ReplacePI {
    public static String replace(String input) {
        if (input.length() <= 1) {
            return input;
        }
        if (input.startsWith("pi")) {
            return "3.14" + replace(input.substring(2));
        }
        return input.charAt(0) + replace(input.substring(1));
    }


    public static void main(String[] args) {
        String str = "sfadsdpifbfbfsfbspisfpipipi";
        System.out.println(replace(str));
    }
}

/*
Test cases:
pippiippip
dggsdgisdgdspisspi
sfadsdpifbfbfsfbspisfpipipi
 */