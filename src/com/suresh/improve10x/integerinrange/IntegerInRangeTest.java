package com.suresh.improve10x.integerinrange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerInRangeTest {


    @Test
    public void nothing() {}

    @Test
    public void givenNValueThree() {
        IntegerInRange integerInRange = new IntegerInRange();
        boolean givenThree = integerInRange.intWithingBounds(3, 3, 6);
        assertEquals(true, givenThree);
    }

    @Test
    public void givenNegative() {
        IntegerInRange integerInRange = new IntegerInRange();
        boolean givenThree = integerInRange.intWithingBounds(-2, -4, -1);
        assertEquals(true, givenThree);
    }

    @Test
    public void given() {
        IntegerInRange integerInRange = new IntegerInRange();
        boolean givenThree = integerInRange.intWithingBounds(10, -4, 5);
        assertEquals(false, givenThree);
    }

    @Test
    public void giveLowerIsBigNumber() {
        IntegerInRange integerInRange = new IntegerInRange();
        boolean givenThree = integerInRange.intWithingBounds(10, 70, 80);
        assertEquals(false, givenThree);
    }
}
