package Lecture3_Recursion1;

// Check if the array elements are sorted or not
public class CheckSorted {

    public static boolean check_sorted1(int[] arr) {
        if (arr.length == 1) return true;
        int[] smallArr = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) smallArr[i - 1] = arr[i];
        boolean rest = check_sorted1(smallArr);
        if (!rest) return false;
        return (arr[0] <= arr[1]);
    }

    public static boolean check_sorted2(int[] arr) {
        if (arr.length == 1) return true;
        if (arr[0] > arr[1]) return false;
        int[] smallArr = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) smallArr[i - 1] = arr[i];
        return check_sorted2(smallArr);
    }

    public static boolean check_sorted3(int[] arr, int index) {
        if (index == arr.length) return true;
        if (arr[index - 1] > arr[index]) return false;
        return check_sorted3(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 1, 3, 5, 6, 9};
        System.out.println(check_sorted1(arr));
        System.out.println(check_sorted2(arr2));
        System.out.println(check_sorted3(arr2,1));
    }
}

