import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 7, 9 };

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}