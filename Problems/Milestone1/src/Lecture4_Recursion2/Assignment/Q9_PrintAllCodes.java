package Lecture4_Recursion2.Assignment;

/*
Print Subset Sum to K
Send Feedback
Given an array A and an integer K, print all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important. Just print them in different lines.
Input format :
Line 1 : Size of input array
Line 2 : Array elements separated by space
Line 3 : K
Sample Input:
9
5 12 3 17 1 18 15 3 17
6
Sample Output:
3 3
5 1
 */
public class Q9_PrintAllCodes {
    public static char helper(int asciVal) {
        return (char) (asciVal + 96);
    }

    public static void printAllPossibleCodes(String input, String out) {
        if (input.length() == 0) {
            System.out.println(out);
            return;
        }
        int l0 = input.charAt(0) - '0';
        printAllPossibleCodes(input.substring(1), out + helper(l0) + ',');
        if (input.length() >= 2) {
            int l1 = input.charAt(0) - '0';
            int l2 = input.charAt(1) - '0';
            int num = l1 * 10 + l2;
            if (num >= 10 && num <= 26) {
                printAllPossibleCodes(input.substring(2), out + helper(num));
            }
        }

    }
}
