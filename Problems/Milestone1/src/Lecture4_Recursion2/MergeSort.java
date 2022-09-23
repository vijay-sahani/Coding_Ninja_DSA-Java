package Lecture4_Recursion2;

public class MergeSort {
    public static void mergeSort(int[] input) {
        // Write your code here
        ms(input, 0, input.length - 1);
    }

    public static void ms(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            ms(arr, low, mid);
            ms(arr, mid + 1, high);
            merge(arr, low, high, mid);
        }
    }

    public static void merge(int[] arr, int low, int high, int mid) {
        int[] merged = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                merged[k++] = arr[i++];
            } else merged[k++] = arr[j++];
        }
        while (i <= mid) merged[k++] = arr[i++];
        while (j <= high) merged[k++] = arr[j++];
        for (int start = 0; start < merged.length; start++) {
            arr[start + low] = merged[start];
        }
    }

    public static void main(String[] args) {
        int[] arr = {23, 1, 92, 3, 4, 2};
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) System.out.printf("%d ->", arr[i]);
    }
}
