package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String str) {

        if(str.length() == 1){
            List<String> substrings = new ArrayList<String>();
            substrings.add(str);
            return substrings.toArray(new String[str.length()]);
        }

        List<String> substrings = Arrays.asList(getAllSubstrings(str.substring(1)));

        for(int i=1; i<=str.length(); i++)
            substrings.add(str.substring(0, i));

        return substrings.toArray(new String[str.length()]);
    }

    public static String[] getCommonSubstrings(String s1, String s2) {
        int MAX_CHAR = 26;
        boolean v[]=new boolean[MAX_CHAR];
        Arrays.fill(v,false);

        // increment vector index for every
        // character of str1
        for (int i = 0; i < s1.length(); i++)
            v[s1.charAt(i) - 'a'] = true;

        // checking common substring of str2 in str1
        for (int i = 0; i < s2.length(); i++)
            if (v[s2.charAt(i) - 'a'])
                return true;

        return false;
    }
}

    public static String getLargestCommonSubstring(String string1, String string2) {
        return null;
    }
}
