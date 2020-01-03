package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

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
        Set<String> a = new HashSet<>(Arrays.asList(getAllSubstrings(s1)));
        Set<String> b = new HashSet<>(Arrays.asList(getAllSubstrings(s2)));

        ArrayList<String> result = new ArrayList<>();
        for (String each: a) {
            if(b.contains(each))
                result.add(each);
        }
        return result.toArray(new String[0]);


    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] commonSubStrings = getCommonSubstrings(string1, string2);
        String largest = commonSubStrings[0];
        for(int i = 1; i < commonSubStrings.length; i++){
            if(commonSubStrings[i].length() > largest.length()){
                largest = commonSubStrings[i];
            }
        }
        return largest;
    }
}
