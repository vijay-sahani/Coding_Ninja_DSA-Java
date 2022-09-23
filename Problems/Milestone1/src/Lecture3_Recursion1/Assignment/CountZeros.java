package Lecture3_Recursion1.Assignment;

public class CountZeros {
    public static int countZerosRec(int input){
        // Write your code here
        if (input==0)return 1;
        return countZero(input,0);
    }
    public static int countZero(int input,int count){
        if (input==0)return count;
        if (input%10==0)count=count+1;
        return countZero(input/10,count);
    }

    public static void main(String[] args) {
        int n=0;
        System.out.println(countZerosRec(n));
    }
}
/*
Test cases:
case1:0
case2:30452032
case3:30056
 */
