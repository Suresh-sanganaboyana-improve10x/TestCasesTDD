package com.suresh.improve10x.findmissingnumber;

public class FindMissingNumber {
    public int missingNum(int[] arr) {
        int totalArray = 55;
        int givenSum = 0;
        int missingNumber = 0;
        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                givenSum += arr[i];
            }
            missingNumber = totalArray - givenSum;
        }

        return missingNumber;
    }
}
