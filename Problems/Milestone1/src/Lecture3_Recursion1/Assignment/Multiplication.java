package Lecture3_Recursion1.Assignment;

/*
Multiplication (Recursive)

Given two integers M & N, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. No other operators are allowed.

 */
public class Multiplication {
    public static int multiplyTwoIntegers(int m, int n) {
        if (n == 0) return 0;
        return m + multiplyTwoIntegers(m, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(multiplyTwoIntegers(2, 3));
    }
}
/*
Test cases:
case1:15 14
case2:23 65
case3:3 27
 */
