import java.util.ArrayList;

public class SumSubsequence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };

        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        sumSub(0, list, 0, arr, n);
    }

    public static void sumSub(int ind, ArrayList<Integer> list, int sum, int[] arr, int n) {
        if (ind == n) {
            if (sum == 2) {
                System.out.println(list);
            }
            return;
        }

        // Include the current element
        list.add(arr[ind]);
        sumSub(ind + 1, list, sum + arr[ind], arr, n);

        // Exclude the current element
        list.remove(list.size() - 1); // Backtrack
        sumSub(ind + 1, list, sum, arr, n); // No change in sum
    }
}
