import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1 };
        int n = 3;
        ArrayList<Integer> list = new ArrayList<>();
        subsequence(0, list, arr, n);
    }

    public static void subsequence(int ind, ArrayList<Integer> list, int[] arr, int n) {
        if (ind == n) {
            System.out.println(list);
            return;
        }

        // Include the current element
        list.add(arr[ind]);
        subsequence(ind + 1, list, arr, n);

        // Exclude the current element (backtrack)
        list.remove(list.size() - 1);
        subsequence(ind + 1, list, arr, n);
    }
}
