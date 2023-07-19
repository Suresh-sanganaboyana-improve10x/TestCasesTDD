package com.suresh.improve10x.stirngendingmatches;

public class StringEndingMatches {
    public Boolean isStringMatches(String strOne, String strTwo) {
        boolean result = false;
        if (strOne == null || strOne == null) {
            result = false;
        } else if (strOne.endsWith(strTwo)) {
            result = true;
        }
        return result;
    }
}
