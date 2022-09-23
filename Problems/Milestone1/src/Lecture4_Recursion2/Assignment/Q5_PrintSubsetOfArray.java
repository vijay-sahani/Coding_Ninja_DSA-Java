package Lecture4_Recursion2.Assignment;

/*
Print Subsets of Array
Send Feedback
Given an integer array (of length n), find and print all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important. Just print the subsets in different lines.
Input format :
Line 1 : Integer n, Size of array
Line 2 : Array elements (separated by space)
Constraints :
1 <= n <= 15
Sample Input:
3
15 20 12
Sample Output:
[] (this just represents an empty array, don't worry about the square brackets)
12
20
20 12
15
15 12
15 20
15 20 12
 */
public class Q5_PrintSubsetOfArray {
    public static void printSubsets(int input[]) {
        // Write your code here
        printSubset(input,new int[0],0);
    }
    public static void printSubset(int[] arr, int[] subs, int i) {
        if (i == arr.length) {
            for (int sub : subs) {
                System.out.print(sub+" ");
            }
            System.out.println();
            return;
        }
        printSubset(arr, subs, i + 1);
        int[] newSubs = new int[subs.length + 1];
        int j = 0;
        for (; j < subs.length; j++) {
            newSubs[j] = subs[j];
        }
        newSubs[j] = arr[i];
        printSubset(arr, newSubs, i + 1);
    }
}
