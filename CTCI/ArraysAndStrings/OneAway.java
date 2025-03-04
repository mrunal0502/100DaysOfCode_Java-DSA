import java.util.HashMap;

public class OneAway {
    public static void main(String[] args) {
        String str1 = "pale";
        String str2 = "bake";
        System.out.println(isOneAway(str1, str2));
    }

    public static boolean isOneAway(String str1, String str2) {
        // int charMissingCount = 0;
        int newCharCount = 0;

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) - 1);
                if (charCountMap.get(c) == 0) {
                    charCountMap.remove(c);
                }
            } else {
                newCharCount++;
            }
        }

        if (newCharCount > 1 || charCountMap.size() > 1) {
            return false;
        }

        return true;
    }
}
