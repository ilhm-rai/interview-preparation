import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VidioTest {

    void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int other = array.length - i - 1;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
    }

    boolean isPrime(int n) {
        for (int x = 2; x <= Math.sqrt(n); x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }

    int factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    int fib(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    int power(int a, int b) {
        if (b < 0) {
            return 0;
        } else if (b == 0) {
            return 1;
        } else {
            return a * power(a, b - 1);
        }
    }

    @Test
    void test() {
        System.out.println(power(3, 3));
    }

    String sortString(String string) {
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    boolean isUnique(String string) {
        char[] chars = string.toCharArray();
        boolean[] found = new boolean[128];
        for (var ch : chars) {
            if (found[ch]) {
                return false;
            }
            found[ch] = true;
        }
        return true;
    }

    boolean isUnique2(String string) {
        String sorted = sortString(string);
        for (int i = 0; i < sorted.length() - 1; i++) {
            if (sorted.charAt(i) == sorted.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    boolean isUnique3(String string) {
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

    @Test
    void testIsUnique() {
        String unique = "abcde";
        Assertions.assertTrue(isUnique(unique));
        Assertions.assertTrue(isUnique2(unique));
        Assertions.assertTrue(isUnique3(unique));
        String notUnique = "aebbcde";
        Assertions.assertFalse(isUnique(notUnique));
        Assertions.assertFalse(isUnique2(notUnique));
        Assertions.assertFalse(isUnique3(notUnique));
        Calendar.getInstance();
    }

}
