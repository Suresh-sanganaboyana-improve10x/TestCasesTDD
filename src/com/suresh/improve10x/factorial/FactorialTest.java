package com.suresh.improve10x.factorial;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    private Factorial factorial;

    @BeforeEach
    public void setup() {
        factorial = new Factorial();
    }
    @Test
    public void nothing() {}

    @Test
    public void getZeroFactorial_returnZero() {
        int factOfZero = factorial.findFactorial(0);
        assertEquals(1, factOfZero);
    }

    @Test
    public void getOneFactorial_returnOne() {
        int factOfOne = factorial.findFactorial(1);
        assertEquals(1, factOfOne);
    }

    @Test
    public void getFactorialFive_returnOneTwenty() {
        int factOfFive = factorial.findFactorial(5);
        assertEquals(120, factOfFive);
    }
}
