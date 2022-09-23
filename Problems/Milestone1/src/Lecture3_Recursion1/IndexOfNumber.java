package Lecture3_Recursion1;

public class IndexOfNumber {
    public static int firstIndex(int input[], int x) {
        return findIndex(input, x, 0);
    }

    public static int findIndex(int[] input, int x, int i) {
        if (i == input.length) return -1;
        if (input[i] == x) return i;
        return findIndex(input, x, i + 1);
    }

    public static int lastIndex(int[] input, int x) {
        return findIndex(input, x, 0, -1);
    }

    public static int findIndex(int[] input, int x, int i, int lst) {
        if (i == input.length) return lst;
        if (input[i] == x) {
            lst = i;
        }
        return findIndex(input, x, i + 1, lst);
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 9, 12, 12, 13, 15, 18, 22, 22, 23, 24, 25, 25, 27, 28, 28, 29, 32, 33, 34, 35, 36, 40, 41, 42, 43, 47, 57, 61, 61, 65, 65, 65, 66, 71, 73, 76, 82, 82, 84, 94, 95,
                99};
        System.out.println(firstIndex(arr, 25));
        System.out.println(lastIndex(arr, 25));
    }
}
/*
Test cases:
case1:15 24 58 61 79 3 97 81 81 45 62 21 72 72 68 45 11 50 87 20 28 77 51 89 58 66 23
case2:34 57 82 41 65 35 82 27 36 12 6 40 66 99 25 29 22 25 12 24 65 15 5 43 28 33 76 32 13 95 22 84 71 23 28 7 65 94 18 47 9 42 61 73 61
case3:21 22 46 12 61 21 33 16 99 96 25
 */
