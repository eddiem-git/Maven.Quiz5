package rocks.zipcode.io.quiz4.fundamentals;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {

    public static String[] getAllSubstrings(String str) {
        Set<String> list = new HashSet<>();

        for(int i = 0; i < str.length(); i++){
            for(int j = i+1; j <= str.length(); j++){
                list.add(str.substring(i,j));
            }
        }
        return list.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String s1, String s2) {
        for( int i = Math.min(s1.length(), s2.length()); ; i--) {
        if(s2.endsWith(s1.substring(0, i))) {
            String[] strings = {s1.substring(0, i)};
        }
    }
}

    public static String getLargestCommonSubstring(String string1, String string2) {
        return null;
    }
}
