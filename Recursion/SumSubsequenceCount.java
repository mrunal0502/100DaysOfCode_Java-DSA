import java.util.ArrayList;

public class SumSubsequenceCount {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };

        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(sumSub(0, list, 0, arr, n));
    }

    public static int sumSub(int ind, ArrayList<Integer> list, int sum, int[] arr, int n) {
        if (ind == n) {
            if (sum == 2) {
                return 1;
            }
            return 0;
        }

        // Include the current element
        list.add(arr[ind]);
        int l = sumSub(ind + 1, list, sum + arr[ind], arr, n);

        // Exclude the current element
        list.remove(list.size() - 1); // Backtrack
        int r = sumSub(ind + 1, list, sum, arr, n); // No change in sum

        return l + r;
    }
}
