package com.suresh.improve10x.nthevennumber;

public class NthEvenNumber {
    public int findNthEvenNumber(int n) {
        int nthEvenNum = 0;
        if (n <= 0) {
            return 0;
        }
        nthEvenNum = (n-1)*2;
        return nthEvenNum;
    }
}
