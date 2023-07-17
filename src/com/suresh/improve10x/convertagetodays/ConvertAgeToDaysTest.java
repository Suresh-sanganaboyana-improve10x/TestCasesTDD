package com.suresh.improve10x.convertagetodays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertAgeToDaysTest {

    ConvertAgeToDays convertAgeToDays;

    @BeforeEach
    public void setup() {
        convertAgeToDays = new ConvertAgeToDays();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenZero() {
        int givenZero = convertAgeToDays.getDays(0);
        assertEquals(0, givenZero);
    }

    @Test
    public void givenOne() {
        int givenOne = convertAgeToDays.getDays(1);
        assertEquals(365, givenOne);
    }

    @Test
    public void given23() {
        int given23 = convertAgeToDays.getDays(23);
        assertEquals(8395, given23);
    }
}
