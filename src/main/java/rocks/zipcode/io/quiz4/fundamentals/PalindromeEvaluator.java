package rocks.zipcode.io.quiz4.fundamentals;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String input) {
        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                if (isPalindrome(input.substring(i, j))) {
                    palindromes.add(input.substring(i, j));
                }
            }
        }
        return palindromes.toArray(new String[input.length()]);
    }

    public static Boolean isPalindrome(String string) {
        int length = string.length();
        for (int i = 0; i < (length/2); ++i) {
            if (string.charAt(i) != string.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);

        return sb.reverse().toString();
    }
}
