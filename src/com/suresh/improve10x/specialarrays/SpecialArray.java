package com.suresh.improve10x.specialarrays;

public class SpecialArray {
//Todo: https://edabit.com/challenge/YmeiRhzaiR3MCPBiT

    public Boolean isSpecialArray(Integer[] array) throws InvalidArrayException {
        Boolean result = false;
        if (array == null || array.length < 1) {
            throw new InvalidArrayException();
        }
        int trueCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (i%2 == 0) {
                if (array[i]%2==0) {
                    trueCount++;
                }
            } else {
                if (array[i]%2!=0) {
                    trueCount++;
                }
            }
        }
        return array.length == trueCount;
    }

    public class InvalidArrayException extends Exception{
    }
}
