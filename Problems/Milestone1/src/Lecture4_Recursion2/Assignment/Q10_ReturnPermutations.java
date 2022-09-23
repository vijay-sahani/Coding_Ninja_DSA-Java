package Lecture4_Recursion2.Assignment;

/*
Return Permutations - String
Send Feedback
Given a string S, find and return all the possible permutations of the input string.
Note 1 : The order of permutations is not important.
Note 2 : If original string contains duplicate characters, permutations will also be duplicates.
Input Format :
String S
Output Format :
All permutations (in different lines)
Sample Input :
abc
Sample Output :
abc
acb
bac
bca
cab
cba
 */
public class Q10_ReturnPermutations {
    public static String[] permutationOfString(String input) {
        // Write your code here
        if (input.length() == 0) return new String[]{""};
        String[] small = permutationOfString(input.substring(1));
        String[] ans = new String[small.length * input.length()];
        int k=0;
        for (int i = 0; i < small.length; i++) {
            for (int j = 0; j <= small[i].length(); j++) {
                ans[k++] = small[i].substring(0, j) + input.charAt(0) + small[i].substring(j);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        for (String str : permutationOfString("cba")) System.out.println(str);
    }
}
