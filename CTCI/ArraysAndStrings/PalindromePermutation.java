import java.util.*;

public class PalindromePermutation {
    public static void main(String[] args) {
        String str = "tactcoa";
        System.out.println(isPalindromePermutation(str));

    }

    public static boolean isPalindromePermutation(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (c != ' ') {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        int oddCount = 0;

        for (int c : charCountMap.values()) {
            if (c % 2 != 0) {
                oddCount++;
            }
            if (oddCount > 1) {
                return false;
            }
        }

        return true;
    }
}
