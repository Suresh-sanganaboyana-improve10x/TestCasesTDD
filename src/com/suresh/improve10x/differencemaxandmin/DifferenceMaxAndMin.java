package com.suresh.improve10x.differencemaxandmin;

public class DifferenceMaxAndMin {

    public static Integer findDifferenceBetweenMaxAndMin(int[] arr) {
        int difference = 0;
        if (arr.length != 0) {
            int min = arr[0];
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            difference = max - min;
        }
        return difference;
    }
}
