package com.suresh.improve10x.stirngendingmatches;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringEndingMatchesTest {

    StringEndingMatches stringEndingMatches;

    @BeforeEach
    public void setup() {
        stringEndingMatches = new StringEndingMatches();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenFalseValues_returnFalse() {
        Boolean stringMatches = stringEndingMatches.isStringMatches("Chiranjeevi", "PawanKalyan");
        assertEquals(false, stringMatches);
    }

    @Test
    public void givenNull_returnFalse() {
        Boolean stringMatches = stringEndingMatches.isStringMatches(null, null);
        assertEquals(false, stringMatches);
    }

    @Test
    public void givenOneStringAndSecondIsEmpty_returnTrue() {
        Boolean stringMatches = stringEndingMatches.isStringMatches("Suresh", "");
        assertEquals(true, stringMatches);
    }

    @Test
    public void givenSureshAndSh_returnTrue() {
        Boolean stringMatches = stringEndingMatches.isStringMatches("Suresh", "sh");
        assertEquals(true, stringMatches);
    }

    @Test
    public void givenSuryaAndSuresh_returnFalls() {
        Boolean stringMatches = stringEndingMatches.isStringMatches("Surya", "Suresh");
        assertEquals(false, stringMatches);
    }
}
