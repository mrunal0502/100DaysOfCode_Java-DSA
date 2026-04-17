public class ToggleCase {
    public static void main(String[] args) {
        String[] strs = { "MrHnAlh", "hffHjLl", "nUyfGgJj" };

        for (String str : strs) {
            StringBuilder res = new StringBuilder();
            for (char ch : str.toCharArray()) {
                if (ch >= 'A' && ch <= 'Z') {
                    res.append((char) (ch + 32));
                } else {
                    res.append((char) (ch - 32));
                }
            }

            System.out.println(res.toString());
        }
    }
}
