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
public class Q6_ReturnSubsetSumToK {
    public static void main(String[] args) {

    }

    public static int[][] subsetsSumK(int input[], int k) {
        return new int[0][2];
    }

    public static int[][] buildSum(int arr[], int k, int i, int[][] subs) {
        if (i == arr.length) return new int[0][];
        if (arr[i - 1] + arr[i] == k) {
            // Todo: if the elements equal to sum;
        }
        int[][] small = buildSum(arr, k, i + 1, subs);
        return small;

    }
}
