import java.util.ArrayList;

public class SumSubsequenceOne {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };

        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(sumSub(0, list, 0, arr, n));
    }

    public static boolean sumSub(int ind, ArrayList<Integer> list, int sum, int[] arr, int n) {
        if (ind == n) {
            if (sum == 2) {
                System.out.println(list);
                return true;
            }
            return false;
        }

        // Include the current element
        list.add(arr[ind]);
        if (sumSub(ind + 1, list, sum + arr[ind], arr, n))
            return true;

        // Exclude the current element
        list.remove(list.size() - 1); // Backtrack
        if (sumSub(ind + 1, list, sum, arr, n))
            return true;

        return false;
    }
}
