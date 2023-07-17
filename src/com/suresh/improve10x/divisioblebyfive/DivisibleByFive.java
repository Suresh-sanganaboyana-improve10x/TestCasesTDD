package com.suresh.improve10x.divisioblebyfive;

public class DivisibleByFive {
    public boolean isDivisibleByFive(int num) {
        Integer temp = num;
        if (temp != null) {
            if (num % 5 == 0) {
                return true;
            }
        }
        return false;
    }
}
