package com.suresh.improve10x.fibonacci;

import com.suresh.improve10x.fibonacci.Fibonacci;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.testng.Assert.assertEquals;

public class FibonacciTest {

    Fibonacci fibonacci;

    @BeforeEach
    public void setup() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void givenZero_ReturnFibZero() {
        int zero = fibonacci.findFibonacci(0);
        assertEquals(0, zero);
    }

    @Test
    public void negativeNumber() {
        /*
        0,1,1,2,3,5,8,13,21,34,55....
        find -1
        find 0
        find 1
        find 5
        */
        int zero = fibonacci.findFibonacci(-2);
        assertEquals(-1,zero);
    }


    @Test
    public void givenOne_returnOne() {
        int oneThFibonacci = fibonacci.findFibonacci(1);
        assertEquals(1, oneThFibonacci);
    }

    @Test
    public void givenTwo_returnOne() {
        int oneThFibonacci = fibonacci.findFibonacci(2);
        assertEquals(1, oneThFibonacci);
    }

    @Test
    public void givenFive_returnFive() {
        int fifthFib = fibonacci.findFibonacci(10);
        assertEquals(55, fifthFib);
    }
}
