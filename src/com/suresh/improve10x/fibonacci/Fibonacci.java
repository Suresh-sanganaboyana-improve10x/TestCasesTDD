package com.suresh.improve10x.fibonacci;

public class Fibonacci {
    public int findFibonacci(int n) {
        if (n<0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return findFibonacci(n-1) + findFibonacci(n-2);
        }
    }
}
