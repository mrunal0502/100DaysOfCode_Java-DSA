import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4, 1, 5, 2, 6, 4 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int size = high - low + 1;
        int[] merged = new int[size];
        int left = low, right = mid + 1, idx = 0;

        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                merged[idx++] = arr[left++];
            } else {
                merged[idx++] = arr[right++];
            }
        }

        while (left <= mid) {
            merged[idx++] = arr[left++];
        }
        while (right <= high) {
            merged[idx++] = arr[right++];
        }

        for (int k = 0; k < size; k++) {
            arr[low + k] = merged[k];
        }

    }

}
