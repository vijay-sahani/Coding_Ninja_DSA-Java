package Lecture3_Recursion1;

public class ArrayContainsElement {
    public static boolean checkNumber(int input[], int x) {
        return check(input, x, 0);
    }

    public static boolean check(int[] input, int x, int i) {
        if (i == input.length) return false;
        if (input[i] == x) return true;
        return check(input, x, i + 1);
    }
}
