import java.util.*;

public class HighLowFreq {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 10, 15, 10, 5 };

        int max = 0;
        int min = arr.length;
        int keyL = 0, keyH = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Correcting the frequency count logic
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1); // FIXED
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int elem = entry.getKey();
            int freq = entry.getValue();

            if (freq < min) {
                min = freq;
                keyL = elem;
            }

            if (freq > max) {
                max = freq;
                keyH = elem;
            }
        }

        System.out.println("Max is " + keyH + " with frequency " + max);
        System.out.println("Min is " + keyL + " with frequency " + min);
    }
}
