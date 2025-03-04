import java.util.HashMap;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aabcccccaaa";
        System.out.println(compressString(str));
    }

    public static String compressString(String str) {
        if (str.length() == 0) {
            return str;
        }

        HashMap<Character, Integer> charCputMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCputMap.put(c, charCputMap.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (char c : charCputMap.keySet()) {
            sb.append(c);
            sb.append(charCputMap.get(c));
        }

        if (sb.length() >= str.length()) {
            return str;
        }

        return sb.toString();
    }
}
