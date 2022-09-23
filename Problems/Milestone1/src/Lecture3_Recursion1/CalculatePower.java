package Lecture3_Recursion1;

public class CalculatePower {
    static int power(int x,int n){
        if (n==1)return x;
        return x*power(x,n-1);
    }
    static int fastPower(int n, int x){
        int ans=1;
        while(x>0){
            if ((x&1)==1){
                ans=ans*n;
            }
            x=x>>1;
            n=n*n;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(power(3,8));
        System.out.println(fastPower(3,8));
    }
}
