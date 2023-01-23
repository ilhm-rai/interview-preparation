package arrays.and.strings;

public class CheckPermutation {

    public static String sortString(String s) {
        char[] chars = s.toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }

    public static boolean permutation(String s, String t) {
        return sortString(s).equals(sortString(t));
    }

    public static boolean permutation2(String s, String t) {
        if (s.length() != t.length()) return false; // Permutations must be same length

        int[] letters = new int[128]; // Assumption: ASCII
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i)]++;
        }

        for (int i = 0; i < t.length(); i++) {
            letters[t.charAt(i)]--;
            if (letters[t.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) + str.substring(i + 1);

            printPermutation(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = permutation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + anagram);
        }

        printPermutation("abb", "");
    }
}
