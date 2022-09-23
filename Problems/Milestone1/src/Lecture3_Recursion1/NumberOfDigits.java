package Lecture3_Recursion1;

// Calculate the number of digits in a number
public class NumberOfDigits {
    public static int calculate(int n){
        if (n==0)return n;
        return 1+ calculate(n/10);
    }

    public static void main(String[] args) {
        System.out.println(calculate(232));
    }
}
