package com.suresh.improve10x.factorial;

public class Factorial {
    public int findFactorial(int n) {
        int fact = 1;
        if (n < 0) {
            return -1;
        }
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }
}
