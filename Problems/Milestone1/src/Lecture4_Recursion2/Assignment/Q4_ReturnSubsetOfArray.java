package Lecture4_Recursion2.Assignment;

/*
Return subsets sum to K
Send Feedback
Given an array A of size n and an integer K, return all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important.
Input format :
Line 1 : Integer n, Size of input array
Line 2 : Array elements separated by space
Line 3 : K
Constraints :
1 <= n <= 20
Sample Input :
9
5 12 3 17 1 18 15 3 17
6
Sample Output :
3 3
5 1
 */
public class Q4_ReturnSubsetOfArray {
    // Return a 2D array that contains all the subsets
    public static int[][] subsets(int input[]) {
        // Write your code here

        return buildSubset(input, 0);
    }

    public static int[][] buildSubset(int[] input, int si) {
        if (input.length == si) {
            return new int[1][0];
        }
        int[][] small = buildSubset(input, si + 1);
        int[][] ans = new int[small.length << 1][];
        int k = 0;
        for (int i = 0; i < small.length; i++) {
            ans[i] = new int[small[i].length];
            for (int j = 0; j < small[i].length; j++) {
                ans[i][j] = small[i][j];
            }
            k++;
        }
        for (int i = 0; i < small.length; i++) {
            ans[k + i] = new int[small[i].length + 1];
            ans[k + i][0] = input[si];
            for (int j = 0; j < small[i].length; j++) {
                ans[i + k][j + 1] = small[i][j];
            }

        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {15, 20, 12};
        int[][] mat = subsets(arr);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
