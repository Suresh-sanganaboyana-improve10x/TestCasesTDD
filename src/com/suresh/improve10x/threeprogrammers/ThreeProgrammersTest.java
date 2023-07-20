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
    public void givenNegative() {
        int givenNegative = threeProgrammers.theProgrammers(-1, -1, -1);
        assertEquals(-1, givenNegative);
    }

    @Test
    public void givenTenZeroZero() {
        int givenTenZeroZero = threeProgrammers.theProgrammers(10, 0, 0);
        assertEquals(10, givenTenZeroZero);
    }

    @Test
    public void givenZeroTenZero() {
        int givenZeroTenZero = threeProgrammers.theProgrammers(0, 10, 0);
        assertEquals(10, givenZeroTenZero);
    }

    @Test
    public void givenZeroZeroTen() {
        int givenZeroZeroTen = threeProgrammers.theProgrammers(0, 0, 10);
        assertEquals(10, givenZeroZeroTen);
    }

    @Test
    public void givenThreeTens() {
        int givenThreeZeros = threeProgrammers.theProgrammers(10, 10, 10);
        assertEquals(0, givenThreeZeros);
    }

    @Test
    public void givenAllEqualAmount() {
        int givenThreeZeros = threeProgrammers.theProgrammers(100, 30, 20);
        assertEquals(80, givenThreeZeros);
    }
}
