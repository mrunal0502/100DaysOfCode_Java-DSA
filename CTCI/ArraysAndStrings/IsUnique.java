// Determine if a string has all unique characters
// Using hashtable

import java.util.*;

public class IsUnique {
    public static void main(String[] args) {
        System.out.println(isUnique("abcde")); // true
    }

    private static boolean isUnique(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }

        Hashtable<Character, Boolean> table = new Hashtable<>();

        char[] ch = str.toCharArray();

        for (char c : ch) {
            if (table.containsKey(c)) {
                return false;
            }

            table.put(c, true);
        }

        return true;

    }

}