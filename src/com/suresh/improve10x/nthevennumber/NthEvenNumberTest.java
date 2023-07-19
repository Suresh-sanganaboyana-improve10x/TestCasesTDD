package com.suresh.improve10x.nthevennumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NthEvenNumberTest {

    NthEvenNumber nthEvenNumber;

    @BeforeEach
    public void setup() {
        nthEvenNumber = new NthEvenNumber();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenZeroNthEven() {
        int givenZero = nthEvenNumber.findNthEvenNumber(0);
        assertEquals(0, givenZero);
    }

    @Test
    public void givenNegative() {
        int givenOne = nthEvenNumber.findNthEvenNumber(-1);
        assertEquals(0, givenOne);
    }

    @Test
    public void givenOne() {
        int givenOne = nthEvenNumber.findNthEvenNumber(1);
        assertEquals(0, givenOne);
    }

    @Test
    public void givenTwo() {
        int givenTwo = nthEvenNumber.findNthEvenNumber(2);
        assertEquals(2, givenTwo);
    }

    @Test
    public void givenThree() {
        int givenThree = nthEvenNumber.findNthEvenNumber(3);
        assertEquals(4, givenThree);
    }

    @Test
    public void givenTen() {
        int givenOne = nthEvenNumber.findNthEvenNumber(10);
        assertEquals(18, givenOne);
    }

    @Test
    public void givenTwenty() {
        int givenTwenty = nthEvenNumber.findNthEvenNumber(20);
        assertEquals(38, givenTwenty);
    }
}
