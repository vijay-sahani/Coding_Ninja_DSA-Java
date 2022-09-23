package Lecture4_Recursion2;

public class Subsequence {
    public static String[] findSubsequence(String s) {
        if (s.length() == 0) {
            return new String[]{""};
        }
        String[] smallSubs = findSubsequence(s.substring(1));
        String[] subs = new String[smallSubs.length << 1];
        for (int i = 0; i < smallSubs.length; i++) {
            subs[i] = smallSubs[i];
            subs[i + smallSubs.length] = s.charAt(0) + smallSubs[i];
        }
        return subs;
    }

    public static void printSubsequence(String s) {
        print(s, "");
    }

    public static void print(String s, String sub) {
        if (s.length() == 0) {
            System.out.println(sub);
            return;
        }
        print(s.substring(1), sub);
        print(s.substring(1), sub + s.charAt(0));
    }


    public static void main(String[] args) {
        String s = "xyz";
        for (String str : findSubsequence(s)) {
            System.out.println(str);
        }
        printSubsequence(s);
    }
}
