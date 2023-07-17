package com.suresh.improve10x.existsahighernumber;

public class ExistsANumberHigher {

    public Boolean isNumberHigher(int[] arr, int num) {
        boolean result = false;
        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= num) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
