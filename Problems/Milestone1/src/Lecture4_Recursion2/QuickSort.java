package Lecture4_Recursion2;

public class QuickSort {
    public static void quickSort(int[] input) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * No need to print or return the output.
         * Taking input and printing output is handled automatically.
         */
        qs(input, 0, input.length - 1);
    }

    public static void qs(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition2(arr, low, high);
            qs(arr, low, pivot - 1);
            qs(arr, pivot + 1, high);
        }
    }

    public static int partition1(int[] arr, int low, int high) {
        int i = low;
        int j = high, pivot = arr[high];
        while (i < j) {
            while (arr[i] < pivot && i < high) i++;
            while (j > 0 && arr[j] >= pivot) j--;
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, i, high);
        return i;
    }

    public static int partition2(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, high);
        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {6,2,1,8,1,9,5};
        quickSort(arr);
        for (int ele : arr) System.out.printf("%d ", ele);
    }
}
