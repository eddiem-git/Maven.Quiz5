package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
    String currentString;

    public StringEvaluatorObject(String str) {
        this.currentString = str;
    }

    public String[] getAllSubstrings() {
        return StringEvaluator.getAllSubstrings(currentString);
    }

    public String[] getCommonSubstrings(String secondInput) {
        return StringEvaluator.getCommonSubstrings(currentString, secondInput);
    }

    public String getLargestCommonSubstring(String secondInput) {
        return StringEvaluator.getLargestCommonSubstring(currentString, secondInput);
    }
}
