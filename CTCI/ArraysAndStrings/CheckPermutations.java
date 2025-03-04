//Given two strings check if one is the permutation of the other

import java.util.*;

public class CheckPermutations {
    public static void main(String[] args) {
        String str = "abc";
        String strr = "cde";

        System.out.println("Method 1 " + check1(str, strr));

        System.out.println("Method 2 " + check2(str, strr));
    }

    public static boolean check1(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }

    public static boolean check2(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (map.get(c) < 0)
                return false;
        }

        return true;
    }
}