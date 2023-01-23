package searching;

import sorting.QuickSort;

public class BinarySearch {

    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 2, 5, 8, 6, 9};
        QuickSort.sort(arr, 0, arr.length - 1);
        System.out.println(binarySearch(arr, 7));
    }
}
