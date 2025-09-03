public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 10, 2, 5, 1 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                // swap
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
