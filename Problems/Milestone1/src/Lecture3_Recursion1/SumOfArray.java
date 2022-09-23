package Lecture3_Recursion1;

public class SumOfArray {
    public static int sum(int input[]) {
        return calculate(input, 0);
    }

    public static int calculate(int[] input, int i) {
        if (i == input.length - 1) return input[i];
        return input[i] + calculate(input, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 23};
        System.out.println(sum(arr));
    }
}
