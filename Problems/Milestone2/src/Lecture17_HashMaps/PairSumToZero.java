package Lecture17_HashMaps;

import java.util.HashMap;

public class PairSumToZero {
    public static int PairSum(int[] input, int size) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            map.put(input[i], i);
        }
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 0) {
                count += 2;
            } else if (map.containsKey(-input[i])) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
