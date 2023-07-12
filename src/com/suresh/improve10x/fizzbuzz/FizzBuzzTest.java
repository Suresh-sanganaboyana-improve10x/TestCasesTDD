package com.suresh.improve10x.fizzbuzz;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void nothing() {
    }

    @Test
    public void checkEmpty() {
        String zero = fizzBuzz.findFizzBuzz(0);
        assertEquals(zero, zero);
    }

    @Test
    public void checkOne_returnOne() {
        String one = fizzBuzz.findFizzBuzz(1);
        assertEquals(one, one);
    }

    @Test
    public void checkThree_returnFizz() {
        String three = fizzBuzz.findFizzBuzz(9);
        assertEquals("Fizz", three);
    }

    @Test
    public void checkFive_returnBuzz() {
        String five = fizzBuzz.findFizzBuzz(5);
        assertEquals("Buzz", five);
    }

    @Test
    public void checkFiveAndThree_returnFizzBuzz() {
        String fiveAndThree = fizzBuzz.findFizzBuzz(15);
        assertEquals("FizzBuzz", fiveAndThree);
    }
}