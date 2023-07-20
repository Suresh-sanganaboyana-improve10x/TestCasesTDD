package com.suresh.improve10x.twomakesten;

public class TwoMakesTen {
    public Boolean areTwoMakesTen(int numOne, int numTwo) {
        boolean result = false;
        if (numOne == 10 || numTwo == 10 || numTwo+numOne == 10) {
            result = true;
        }
        return result;
    }
}
