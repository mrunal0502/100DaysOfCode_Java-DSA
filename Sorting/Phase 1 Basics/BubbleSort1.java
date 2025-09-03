public class BubbleSort1 {
    public static void main(String[] args) {
        int[] arr = { 46, 67, 3, 45, 2, 9 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int didSwap = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0)
                break;
        }
        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
