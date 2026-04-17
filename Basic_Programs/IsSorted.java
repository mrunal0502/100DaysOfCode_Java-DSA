public class IsSorted {
    public static void main(String[] args) {
        int[] arr = { 9, 6, 3, 5, 8, };

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}