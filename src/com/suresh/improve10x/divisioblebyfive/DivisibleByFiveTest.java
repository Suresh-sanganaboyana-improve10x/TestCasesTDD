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
    public void givenZero() {
        boolean givenZero = divisibleByFive.isDivisibleByFive(0);
        assertEquals(true, givenZero);
    }

    @Test
    public void givenNegative() {
        boolean givenNegative = divisibleByFive.isDivisibleByFive(-5);
        assertEquals(true, givenNegative);
    }

    @Test
    public void givenFive() {
        boolean givenFive = divisibleByFive.isDivisibleByFive(5);
        assertEquals(true, givenFive);
    }

    @Test
    public void givenThree() {
        boolean givenThree = divisibleByFive.isDivisibleByFive(3);
        assertEquals(false, givenThree);
    }

    @Test
    public void givenFifteen() {
        boolean givenFifteen = divisibleByFive.isDivisibleByFive(15);
        assertEquals(true, givenFifteen);
    }

    @Test
    public void givenTwenty() {
        boolean givenTwenty = divisibleByFive.isDivisibleByFive(20);
        assertEquals(true, givenTwenty);
    }

    @Test
    public void givenTwentyTwo() {
        boolean givenTwentyTwo = divisibleByFive.isDivisibleByFive(22);
        assertEquals(false, givenTwentyTwo);
    }
}
