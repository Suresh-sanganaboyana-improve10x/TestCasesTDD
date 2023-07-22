package com.suresh.improve10x.checkiftwostringsignoring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoStringsIgnoringSameCaseTest {

    TwoStringsIgnoringSameCases twoStringsIgnoringSameCases;

    @BeforeEach
    public void setup() {
        twoStringsIgnoringSameCases = new TwoStringsIgnoringSameCases();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenFalse_returnFalse() {
        TwoStringsIgnoringSameCases stringsIgnoringSameCases = new TwoStringsIgnoringSameCases();
        boolean givenFalse = stringsIgnoringSameCases.areTwoStringsSame("Suresh", "Surya");
        assertEquals(false, givenFalse);
    }

    @Test
    public void givenEmpty_returnTrue() {
        TwoStringsIgnoringSameCases stringsIgnoringSameCases = new TwoStringsIgnoringSameCases();
        boolean givenEmpty = stringsIgnoringSameCases.areTwoStringsSame("", "");
        assertEquals(true, givenEmpty);
    }

    @Test
    public void givenNull_returnFalse() {
        TwoStringsIgnoringSameCases stringsIgnoringSameCases = new TwoStringsIgnoringSameCases();
        boolean givenEmpty = stringsIgnoringSameCases.areTwoStringsSame(null, null);
        assertEquals(false, givenEmpty);
    }

    @Test
    public void givenSuresh_returnTrue() {
        TwoStringsIgnoringSameCases stringsIgnoringSameCases = new TwoStringsIgnoringSameCases();
        boolean givenEmpty = stringsIgnoringSameCases.areTwoStringsSame("suresh", "SURESH");
        assertEquals(true, givenEmpty);
    }

    @Test
    public void givenMani_returnTrue() {
        TwoStringsIgnoringSameCases stringsIgnoringSameCases = new TwoStringsIgnoringSameCases();
        boolean givenEmpty = stringsIgnoringSameCases.areTwoStringsSame("Mani", "maNi");
        assertEquals(true, givenEmpty);
    }
}
