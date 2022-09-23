package DynamicProgramming1;

public class Fibonacci {
    public static int recursive(int n) {
        if (n == 0 || n == 1) return n;
        return recursive(n - 1) + recursive(n - 2);
    }

    public static int recursiveMemo(int n, int[] storage) {
        if (n == 0 || n == 1) {
            storage[n] = n;
            return storage[n];
        }
        if (storage[n] != 0) return storage[n];
        storage[n] = recursiveMemo(n - 1,storage) + recursiveMemo(n - 2,storage);
        return storage[n];
    }

    public static int recursiveM(int n){
        int[] storage=new int[n+1];
        return recursiveMemo(n,storage);
    }
    public static int dynamicProgramming(int n){
        int[] storage=new int[n+1];
        storage[1]=1;
        for (int i=2;i<=n;i++){
           storage[i]=storage[i-1]+storage[i-2];
        }
        return storage[n];
    }
    public static void main(String[] args) {
        int n=40;
        System.out.println(dynamicProgramming(n));
        System.out.println(recursiveM(n));
        System.out.println(recursive(n));
    }
}
