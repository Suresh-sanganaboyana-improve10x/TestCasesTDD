package com.suresh.improve10x.divisioblebyfive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisibleByFiveTest {

    DivisibleByFive divisibleByFive;

    @BeforeEach
    public void setup() {
        divisibleByFive = new DivisibleByFive();
    }
    @Test
    public void nothing() {
    }

    @Test
    public void givenNegative_returnTrue() {
        boolean givenNegative = divisibleByFive.isDivisibleByFive(-5);
        assertEquals(true, givenNegative);
    }

    @Test
    public void givenNegativeOne_returnTrue() {
        boolean givenNegativeOne = divisibleByFive.isDivisibleByFive(-1);
        assertEquals(false, givenNegativeOne);
    }

    @Test
    public void givenZero_returnTrue() {
        boolean givenZero = divisibleByFive.isDivisibleByFive(0);
        assertEquals(true, givenZero);
    }

    @Test
    public void givenFive_returnTrue() {
        boolean givenFive = divisibleByFive.isDivisibleByFive(5);
        assertEquals(true, givenFive);
    }

    @Test
    public void givenThree_returnFalse() {
        boolean givenThree = divisibleByFive.isDivisibleByFive(3);
        assertEquals(false, givenThree);
    }

    @Test
    public void givenFifteen_returnTrue() {
        boolean givenFifteen = divisibleByFive.isDivisibleByFive(15);
        assertEquals(true, givenFifteen);
    }

    @Test
    public void givenTwenty_returnTrue() {
        boolean givenTwenty = divisibleByFive.isDivisibleByFive(20);
        assertEquals(true, givenTwenty);
    }

    @Test
    public void givenTwentyTwo_returnFalse() {
        boolean givenTwentyTwo = divisibleByFive.isDivisibleByFive(22);
        assertEquals(false, givenTwentyTwo);
    }
}
