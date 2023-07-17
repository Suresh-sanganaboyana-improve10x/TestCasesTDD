package com.suresh.improve10x.threeprogrammers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeProgrammersTest {

    ThreeProgrammers threeProgrammers;

    @BeforeEach
    public void setup() {
        threeProgrammers = new ThreeProgrammers();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenThreeZeros() {
        int givenThreeZeros = threeProgrammers.theProgrammers(0, 0, 0);
        assertEquals(0, givenThreeZeros);
    }

    @Test
    public void givenThirtyTwentyTen() {
        int givenThreeZeros = threeProgrammers.theProgrammers(30, 20, 10);
        assertEquals(20, givenThreeZeros);
    }

    @Test
    public void givenAmountInThousands() {
        int givenThreeZeros = threeProgrammers.theProgrammers(30000, 10000, 50000);
        assertEquals(40000, givenThreeZeros);
    }

    @Test
    public void givenFirstTest() {
        int givenThreeZeros = threeProgrammers.theProgrammers(147, 33, 526);
        assertEquals(493, givenThreeZeros);
    }

    @Test
    public void givenSecondTest() {
        int givenThreeZeros = threeProgrammers.theProgrammers(33, 72, 74);
        assertEquals(41, givenThreeZeros);
    }

    @Test
    public void givenNegative() {
        int givenThreeZeros = threeProgrammers.theProgrammers(-33, -72, -74);
        assertEquals(41, givenThreeZeros);
    }

    @Test
    public void givenAllEqualAmount() {
        int givenThreeZeros = threeProgrammers.theProgrammers(1000, 1000, 1000);
        assertEquals(0, givenThreeZeros);
    }
}
