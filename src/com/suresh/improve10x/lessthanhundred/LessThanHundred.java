package com.suresh.improve10x.lessthanhundred;

public class LessThanHundred {
    public boolean isLessThanHundred(int numOne, int numTwo) {
        boolean result = false;
        if (numOne+numTwo < 100) {
            result = true;
        }
        return result;
    }
}
