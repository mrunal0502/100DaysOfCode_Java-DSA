public class BinarySearcg {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 3;
        int start = 0;
        int end = arr.length - 1;

        binarySearch(arr, target, start, end);
    }

    public static void binarySearch(int[] arr, int target, int start, int end) {
        // Base case: If start index exceeds end index, element is not found
        if (start > end) {
            System.out.println("Element not found.");
            return;
        }

        // Calculate mid-point
        int mid = start + (end - start) / 2;

        // Check if mid is the target
        if (arr[mid] == target) {
            System.out.println("Element is present at index " + mid);
            return;
        }

        // Recursively search in the left or right half
        if (arr[mid] > target) {
            binarySearch(arr, target, start, mid - 1);
        } else {
            binarySearch(arr, target, mid + 1, end);
        }
    }
}
