package com.suresh.improve10x.checkiftwostringsignoring;

public class TwoStringsIgnoringSameCases {
    public boolean areTwoStringsSame(String stringOne, String stringTwo) {
        boolean result = false;
        if (stringOne == null && stringTwo == null) {
            result = false;
        } else if (stringOne.equalsIgnoreCase(stringTwo)){
            result = true;
        }
        return result;
    }
}
