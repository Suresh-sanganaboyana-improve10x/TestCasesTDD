package com.suresh.improve10x.twomakesten;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoMakesTenTest {

    TwoMakesTen twoMakesTen;

    @BeforeEach
    public void setup() {
        twoMakesTen = new TwoMakesTen();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenZeros_returnFalse() {
        Boolean givenZeros = twoMakesTen.areTwoMakesTen(0, 0);
        assertEquals(false, givenZeros);
    }

    @Test
    public void givenOneAndNine_returnTrue() {
        Boolean givenOneAndNine = twoMakesTen.areTwoMakesTen(1, 9);
        assertEquals(true, givenOneAndNine);
    }

    @Test
    public void givenNegativeNumbers() {
        Boolean givenNegative = twoMakesTen.areTwoMakesTen(-2, -8);
        assertEquals(false, givenNegative);
    }

    @Test
    public void givenTenAndTen_returnTrue() {
        Boolean givenTenTen = twoMakesTen.areTwoMakesTen(10, 10);
        assertEquals(true, givenTenTen);
    }

    @Test
    public void givenThreeAndFive_returnFalse() {
        Boolean givenThreeAndFive = twoMakesTen.areTwoMakesTen(3, 5);
        assertEquals(false, givenThreeAndFive);
    }

    @Test
    public void givenNineAndNine_returnFalse() {
        Boolean givenThreeAndFive = twoMakesTen.areTwoMakesTen(9, 9);
        assertEquals(false, givenThreeAndFive);
    }
}
