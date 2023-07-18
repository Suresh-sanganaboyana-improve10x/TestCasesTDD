package com.suresh.improve10x.lessthanhundred;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LessThanHundredTest {

    LessThanHundred lessThanHundred;

    @BeforeEach
    public void setup() {
        lessThanHundred = new LessThanHundred();
    }
    @Test
    public void nothing() {}

    @Test
    public void givenFalseValue_returnFalse() {
        boolean givenFalseValue = lessThanHundred.isLessThanHundred(50, 50);
        assertEquals(false, givenFalseValue);
    }

    @Test
    public void givenZeros_returnTrue() {
        boolean givenZeros = lessThanHundred.isLessThanHundred(0, 0);
        assertEquals(true, givenZeros);
    }

    @Test
    public void givenNegativeNumbers() {
        boolean givenFiftyAndForty = lessThanHundred.isLessThanHundred(-50, -40);
        assertEquals(true, givenFiftyAndForty);
    }

    @Test
    public void givenFiftyAndHundred() {
        boolean givenFiftyAndHundred = lessThanHundred.isLessThanHundred(50, 100);
        assertEquals(false, givenFiftyAndHundred);
    }

    @Test
    public void givenFiftyAndForty() {
        boolean givenFiftyAndForty = lessThanHundred.isLessThanHundred(50, 40);
        assertEquals(true, givenFiftyAndForty);
    }



    @Test
    public void givenNinetyNineAndOne() {
        boolean givenNinetyNineAndOne = lessThanHundred.isLessThanHundred(99, 1);
        assertEquals(false, givenNinetyNineAndOne);
    }

    @Test
    public void givenNinetyAndNine() {
        boolean givenNinetyAndNine = lessThanHundred.isLessThanHundred(90, 9);
        assertEquals(true, givenNinetyAndNine);
    }
}
