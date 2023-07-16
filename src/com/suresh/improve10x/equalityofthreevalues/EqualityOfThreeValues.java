package com.suresh.improve10x.equalityofthreevalues;

public class EqualityOfThreeValues {
    public int findEqualityOfValues(int a, int b, int c) {
        int equalityOfThreeValues = 0;
        if (a == b && b == c) {
            equalityOfThreeValues = 3;
        } else if (a == b || a == c || b == c) {
            equalityOfThreeValues = 2;
        }
        return equalityOfThreeValues;
    }
}
