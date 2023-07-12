package com.suresh.improve10x.fizzbuzz;

public class FizzBuzz {
    public String findFizzBuzz(int n) {
        String result = "";
        int temp = n;
        if (temp % 3 == 0 && temp % 5 == 0) {
            result = "FizzBuzz";
        } else if (temp % 3 == 0) {
            result = "Fizz";
        } else if (temp % 5 == 0) {
            result = "Buzz";
        } else {
            result = String.valueOf(temp);
        }
        return result;
    }
}
