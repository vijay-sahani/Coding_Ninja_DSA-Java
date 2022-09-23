package Lecture3_Recursion1.Assignment;
/*
Pair Star
Send Feedback
Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
 */
public class Q4_PairStar {
    public static String addStars(String s) {
        if (s.length()<=1)return s;
        if (s.charAt(0)==s.charAt(1)){
            return s.charAt(0)+"*"+addStars(s.substring(1));
        }
        return s.charAt(0)+addStars(s.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(addStars("aaaa"));
    }
}
