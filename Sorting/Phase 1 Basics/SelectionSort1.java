public class SelectionSort1 {
    public static void main(String[] args) {
        int arr[] = { 46, 67, 3, 45, 2, 9 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int mini = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }

        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
