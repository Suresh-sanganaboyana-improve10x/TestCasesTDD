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
    public void givenNegativeNumbers() {
        Boolean givenNegative = twoMakesTen.areTwoMakesTen(-1, -1);
        assertEquals(false, givenNegative);
    }

    @Test
    public void givenNineOne_returnTrue() {
        Boolean givenNineOne = twoMakesTen.areTwoMakesTen(9, 1);
        assertEquals(true, givenNineOne);
    }

    @Test
    public void givenOneNine_returnTrue() {
        Boolean givenOneNine = twoMakesTen.areTwoMakesTen(1, 9);
        assertEquals(true, givenOneNine);
    }

    @Test
    public void givenTenZero_returnTrue() {
        Boolean givenTenZero = twoMakesTen.areTwoMakesTen(10, 0);
        assertEquals(true, givenTenZero);
    }

    @Test
    public void givenZeroTen_returnTrue() {
        Boolean givenZeroTen = twoMakesTen.areTwoMakesTen(0, 10);
        assertEquals(true, givenZeroTen);
    }

    @Test
    public void givenTenTen_returnTrue() {
        Boolean givenTenTen = twoMakesTen.areTwoMakesTen(10, 10);
        assertEquals(true, givenTenTen);
    }

    @Test
    public void givenFiveSix_returnFalse() {
        Boolean givenTenTen = twoMakesTen.areTwoMakesTen(5, 6);
        assertEquals(false, givenTenTen);
    }
}
