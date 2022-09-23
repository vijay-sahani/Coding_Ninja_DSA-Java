package Lecture3_Recursion1.Assignment;

/*
Sum of digits (recursive)
Send Feedback
Write a recursive function that returns the sum of the digits of a given integer.
 */
public class SumOfDigits {
    public static int sumOfDigits(int input) {
        if (input == 0)
            return 0;
        return input % 10 + sumOfDigits(input / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(202));
    }
}
/*
Test cases
15667
1099
1231
 */