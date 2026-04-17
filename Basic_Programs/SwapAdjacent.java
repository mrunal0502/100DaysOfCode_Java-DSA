public class SwapAdjacent {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 7, 9, 3 };
        for (int i = 0; i < arr.length - 2; i += 2) {
            swap(arr, i, i + 1);
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}