package DynamicProgramming1;

public class MinSteps {
    public static int recursive(int n) {
        if (n == 1) {
            return 0;
        }
        int minSteps = recursive(n - 1);
        if (n % 3 == 0) {
            int op2 = recursive(n / 3);
            minSteps = Math.min(op2, minSteps);
        }
        if (n % 2 == 0) {
            int op3 = recursive(n / 2);
            minSteps = Math.min(op3, minSteps);
        }
        return minSteps + 1;
    }

    public static int recursiveM(int n, int[] storage) {
        if (n == 1) {
            storage[n] = 0;
            return storage[n];
        }
        if (storage[n] != 0) {
            return storage[n];
        }
        int minSteps = recursiveM(n - 1,storage);
        if (n % 3 == 0) {
            int op2 = recursiveM(n / 3,storage);
            minSteps = Math.min(op2, minSteps);
        }
        if (n % 2 == 0) {
            int op3 = recursiveM(n / 2,storage);
            minSteps = Math.min(op3, minSteps);
        }
        storage[n] = minSteps + 1;
        return storage[n];
    }

    public static int recursiveMemo(int n) {
        int[] storage = new int[n + 1];
        return recursiveM(n, storage);
    }

    public static int dynamicProgramming(int n) {
        int[] storage = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            int min = storage[i - 1];
            if (i % 3 == 0) {
                min = Math.min(min, storage[i / 3]);
            }
            if ((i&1) == 0) {
                min = Math.min(min, storage[i >> 1]);
            }
            storage[i] = min + 1;
        }
        return storage[n];
    }

    public static void main(String[] args) {
        int n = 1000;
        System.out.println(dynamicProgramming(n));
        System.out.println(recursiveMemo(n));
        System.out.println(recursive(n));
    }
}
