package com.suresh.improve10x.integerinrange;

public class IntegerInRange {
    public boolean intWithingBounds(int n, int lower, int upper) {
        boolean result = false;
        if (n >= lower && n < upper) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
