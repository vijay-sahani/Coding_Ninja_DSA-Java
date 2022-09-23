package DynamicProgramming1;

public class ClimbingStaircase {
    public static int recursive(int n) {
        if (n == 0) return 1;
        else if (n < 0) return 0;
        int total = recursive(n - 1);
        total += recursive(n - 2);
        total += recursive(n - 3);
        return total;
    }

    public static int recursiveM(int n, int[] storage) {
        if (n == 0) {
            storage[n] = 1;
            return storage[n];
        }
        if (n < 0) return 0;
        if (storage[n] != 0) return storage[n];
        int first = recursiveM(n - 1, storage);
        int second = storage[n] = recursiveM(n - 2, storage);
        int third = recursiveM(n - 3, storage);
        storage[n] = first + second + third;
        return storage[n];
    }

    public static long recursiveMemo(int n) {
        int[] storage = new int[n + 1];
        return recursiveM(n, storage);
    }

    public static long dynamicProgramming(int n){
        int[] storage=new int[n+1];
        storage[0]=1;
        for(int i=1;i<=n;i++){
            int steps=storage[i-1];
            if (i-2>=0){
                steps+=storage[i-2];
            }
            if (i-3>=0){
                steps+=storage[i-3];
            }
            storage[i]=steps;
        }
        return storage[n];
    }
    public static void main(String[] args) {

        int n=8;
//        System.out.println(recursive(4));
        System.out.println(recursiveMemo(n));
        System.out.println(dynamicProgramming(n));

    }
}
