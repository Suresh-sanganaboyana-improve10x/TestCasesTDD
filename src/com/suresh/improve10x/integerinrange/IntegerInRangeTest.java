package com.suresh.improve10x.integerinrange;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerInRangeTest {

    IntegerInRange integerInRange;

    @BeforeEach
    public void setup() {
        integerInRange = new IntegerInRange();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenDifferentValues_returnFalse() {
        boolean givenThree = integerInRange.intWithingBounds(3, 5, 6);
        assertEquals(false, givenThree);
    }

    @Test
    public void givenNValueThree() {
        boolean givenThree = integerInRange.intWithingBounds(3, 3, 6);
        assertEquals(true, givenThree);
    }

    @Test
    public void givenNegative() {
        boolean givenThree = integerInRange.intWithingBounds(-2, -4, -1);
        assertEquals(true, givenThree);
    }

    @Test
    public void given() {
        boolean givenThree = integerInRange.intWithingBounds(10, -4, 5);
        assertEquals(false, givenThree);
    }

    @Test
    public void giveLowerIsBigNumber() {
        boolean givenThree = integerInRange.intWithingBounds(10, 70, 80);
        assertEquals(false, givenThree);
    }
}
