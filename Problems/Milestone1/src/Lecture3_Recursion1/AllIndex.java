package Lecture3_Recursion1;
/*
Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
Do this recursively. Indexing in the array starts from 0.
 */

import java.util.Arrays;

public class AllIndex {
    public static int[] allIndexes(int input[], int x) {


        return findAll(input, x, 0, new int[0], 0);
    }

    public static int[] findAll(int[] input, int x, int i, int[] index, int foundIdx) {
        if (i == input.length) return index;
        if (input[i] == x) {
            int[] sml = new int[foundIdx + 1];
            for (int j = 0; j < index.length; j++) {
                sml[j] = index[j];
            }
            sml[foundIdx++] = i;
            index = sml;
        }
        return findAll(input, x, i + 1, index, foundIdx);
    }

    public static void main(String[] args) {
        int[] arr = {3, 11, 15, 20, 21, 23, 24, 28, 45, 45, 50, 51, 58, 58, 61, 62, 66, 68, 72, 72, 77, 79, 81, 81, 87, 89,
                97};
        Arrays.stream(allIndexes(arr, 45)).forEach(System.out::println);
    }
}
/*
Test Cases:
case1:15 24 58 61 79 3 97 81 81 45 62 21 72 72 68 45 11 50 87 20 28 77 51 89 58 66 23
case2:34 57 82 41 65 35 82 27 36 12 6 40 66 99 25 29 22 25 12 24 65 15 5 43 28 33 76 32 13 95 22 84 71 23 28 7 65 94 18 47 9 42 61 73 61
case3:21 22 46 12 61 25 33 16 99 96 25 25
 */