package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
    String str1;
    String str2;
    public StringEvaluatorObject(String str) {
        this.str1 = str;
    }
    public StringEvaluatorObject(String str1, String str2){
        this.str1 = str1;
        this.str2 = str2;
    }

    public String[] getAllSubstrings() {
        return StringEvaluator.getAllSubstrings(str1);
    }

    public String[] getCommonSubstrings(String secondInput) {
        return StringEvaluator.getCommonSubstrings(secondInput,str1);
    }

    public String getLargestCommonSubstring(String secondInput) {
        return StringEvaluator.getLargestCommonSubstring(secondInput, str1);
    }
}
