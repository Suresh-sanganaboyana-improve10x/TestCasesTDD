package com.suresh.improve10x.fizzbuzz;

public class FizzBuzz {
    public String findFizzBuzz(int n) {
        if (n > 0) {
            if (n % 3 == 0 && n % 5 == 0) {
                return "FizzBuzz";
            } else if (n % 3 == 0) {
                return "Fizz";
            } else if (n % 5 == 0) {
                return "Buzz";
            }
            }
        return String.valueOf(n);
    }
}
