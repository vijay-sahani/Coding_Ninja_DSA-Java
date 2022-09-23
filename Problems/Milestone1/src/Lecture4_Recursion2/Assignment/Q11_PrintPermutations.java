package Lecture4_Recursion2.Assignment;

/*
Print Permutations
Send Feedback
Given an input string (STR), print all possible permutations of the input string.
Note:
The input string may contain the same characters, so there will also be the same permutations.
The order of permutations doesn’t matter.
Input Format:
The only input line contains a string (STR) of alphabets in lower case
Output Format:
Print each permutations in a new line
Constraint:
1<=length of STR<=8
Time Limit: 1sec
Sample Input 1:
cba
Sample Output 1:
abc
acb
bac
bca
cab
cba
 */
public class Q11_PrintPermutations {
    public static void printPermutation(String s) {
        print(s, "");
    }

    public static void print(String s, String out) {
        if (s.length() == 0) {
            System.out.println(out);
            return;
        }
        print(s.substring(1), out);
        for (int i = 0; i < s.length(); i++) {
            print(s.substring(1), s.charAt(0) + out);
        }
    }

    public static void main(String[] args) {
        printPermutation("cba");
    }
}
