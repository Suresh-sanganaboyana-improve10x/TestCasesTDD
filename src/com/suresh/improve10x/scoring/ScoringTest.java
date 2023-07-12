package com.suresh.improve10x.scoring;

import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class ScoringTest {
    private Scoring scoring = new Scoring();

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnZero() {
        int[] getNull = scoring.calculateScores(null);
        assertArrayEquals(new int[] {0, 0, 0}, getNull);
    }

    @Test
    public void givenEmpty_returnZero() {
        int[] empty = scoring.calculateScores("");
        assertArrayEquals(new int[] {0, 0, 0}, empty);
    }

    @Test
    public void givenA_returnOneZeroZero() {
        int[] givenA = scoring.calculateScores("A");
        assertArrayEquals(new int[] {1, 0, 0}, givenA);
    }

    @Test
    public void givenB_returnZeroOneZero() {
        int[] getBScores = scoring.calculateScores("B");
        assertArrayEquals(new int[] {0, 1, 0}, getBScores);
    }

    @Test
    public void givenC_returnZeroZeroOne() {
        int[] getCScores = scoring.calculateScores("C");
        assertArrayEquals(new int[] {0, 0, 1}, getCScores);
    }

    @Test
    public void givenAB_returnOneOneZero() {
        int[] getABScores = scoring.calculateScores("AB");
        assertArrayEquals(new int[] {1, 1, 0}, getABScores);
    }

    @Test
    public void givenABC_returnOneOneOne() {
        int[] getABCScores = scoring.calculateScores("ABC");
        assertArrayEquals(new int[] {1, 1, 1}, getABCScores);
    }

    @Test
    public void givenAABC_returnTwoOneOne() {
        int[] getAABCScores = scoring.calculateScores("AABC");
        assertArrayEquals(new int[] {2, 1, 1}, getAABCScores);
    }

    @Test
    public void givenABBC_returnOneTwoOne() {
        int[] getABBCScores = scoring.calculateScores("ABBC");
        assertArrayEquals(new int[] {1, 2, 1}, getABBCScores);
    }

    @Test
    public void givenABCC_returnOneOneTwo() {
        int[] getABCCScores = scoring.calculateScores("ABCC");
        assertArrayEquals(new int[] {1, 1, 2}, getABCCScores);
    }

    @Test
    public void givenABBACCCCBC_twoThreeFive() {
        int[] getABCScores = scoring.calculateScores("ABBACCCCBC");
        assertArrayEquals(new int[] {2, 3, 5}, getABCScores);
    }
}
