package arrays.and.strings;

import java.util.Arrays;

public class UniqueChars {

    static boolean isUniqueChars(String string) {
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isUniqueChars2(String string) {
        boolean[] charSet = new boolean[128];
        for (int i = 0; i < string.length(); i++) {
            int val = string.charAt(i);
            if (charSet[val]) {
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }

    static boolean isUniqueChars3(String string) {
        String sortedString = sortString(string);
        for (int i = 0; i < sortedString.length() - 1; i++) {
            if (sortedString.charAt(i) == sortedString.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    static String sortString(String string) {
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        String[] words = new String[]{"abcde", "hello", "apple", "kite", "padle"};
        for (var word : words) {
            System.out.println("1 : " + isUniqueChars(word));
            System.out.println("2 : " + isUniqueChars2(word));
            System.out.println("3 : " + isUniqueChars3(word));
        }
    }
}
