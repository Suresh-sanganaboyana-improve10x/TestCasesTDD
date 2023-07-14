package com.suresh.improve10x.stirngendingmatches;

public class StringEndingMatches {
    public Boolean isStringMatches(String strOne, String strTwo) {
        if (strOne.endsWith(strTwo)) {
            return true;
        } else {
            return false;
        }
    }
}
