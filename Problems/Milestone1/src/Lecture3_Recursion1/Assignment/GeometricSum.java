package Lecture3_Recursion1.Assignment;

/*
Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
using recursion.
 */
public class GeometricSum {
    public static double findGeometricSum(int k) {
        // base case
        if (k == 0) return 1;
        return findGeometricSum(k - 1) + Math.pow(2, -k);
    }

    public static void main(String[] args) {
        System.out.println(findGeometricSum(4));
    }
}
/*
Test cases:
case1:3
case2:4
case3:5
 */
