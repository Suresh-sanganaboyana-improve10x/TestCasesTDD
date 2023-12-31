package com.suresh.improve10x.threeprogrammers;

public class ThreeProgrammers {
    public int theProgrammers(int prgOne, int prgTwo, int prgThree) {
        int difference = 0;
        int maxAmount;
        int minAmount;
        if (prgOne < 0 && prgTwo < 0 && prgThree < 0) {
            return -1;
        }
        maxAmount = findMax(prgOne, prgTwo, prgThree);
        minAmount = findMin(prgOne, prgTwo, prgThree);
        difference = maxAmount - minAmount;
        return difference;
    }

    private static int findMax(int prgOne, int prgTwo, int prgThree) {
        if (prgOne > prgTwo && prgOne > prgThree) {
            return prgOne;
        } else if (prgTwo > prgThree) {
            return prgTwo;
        } else {
            return prgThree;
        }
    }

    private static int findMin(int prgOne, int prgTwo, int prgThree) {
        if (prgOne < prgTwo && prgOne < prgThree) {
            return prgOne;
        } else if (prgTwo < prgThree) {
            return prgTwo;
        } else {
            return prgThree;
        }
    }
}
