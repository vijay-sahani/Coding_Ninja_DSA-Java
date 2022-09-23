package Lecture4_Recursion2.Assignment;
/*
Binary Search (Recursive)
Send Feedback
Given an integer sorted array (sorted in increasing order) and an element x, find the x in given array using binary search. Return the index of x.
Return -1 if x is not present in the given array.
Note : If given array size is even, take first mid.
Input format :

Line 1 : Array size

Line 2 : Array elements (separated by space)

Line 3 : x (element to be searched)

Sample Input :
6
2 3 4 5 6 8
5
Sample Output:
3
 */
public class Q3_BinarySearch {
    public static int binarySearch(int input[], int element) {
        // Write your code here
        return search(input, element, 0, input.length - 1);
    }

    public static int search(int[] arr, int ele, int low, int high) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == ele) return mid;
            else if (arr[mid] > ele) return search(arr, ele, low, mid - 1);
            else return search(arr, ele, mid + 1, high);
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
