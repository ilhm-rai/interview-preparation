import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PalindromeTest {

    private boolean isPalindromeRecursive(String word, int i) {
        if (i < word.length() / 2) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            } else {
                return isPalindromeRecursive(word, i + 1);
            }
        } else {
            return true;
        }
    }

    private boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            int indexAkhir = word.length() - i - 1;

            if (word.charAt(i) != word.charAt(indexAkhir)) {
                return false;
            }
        }

        return true;
    }

    @Test
    void testPalindrome() {
        Assertions.assertTrue(isPalindrome("a"));
        Assertions.assertTrue(isPalindrome("aba"));
        Assertions.assertTrue(isPalindrome("kodok"));
        Assertions.assertTrue(isPalindrome(""));

        Assertions.assertFalse(isPalindrome("ab"));
        Assertions.assertFalse(isPalindrome("abab"));
        Assertions.assertFalse(isPalindrome("kodcok"));
        Assertions.assertFalse(isPalindrome("rai"));
    }

    @Test
    void name() {
    }
}
