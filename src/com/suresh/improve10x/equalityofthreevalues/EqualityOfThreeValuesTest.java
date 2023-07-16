package com.suresh.improve10x.equalityofthreevalues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EqualityOfThreeValuesTest {

    EqualityOfThreeValues equalityOfThreeValues;

    @BeforeEach
    public void setup() {
        equalityOfThreeValues = new EqualityOfThreeValues();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenAllZeros() {
        int givenAllZeros = equalityOfThreeValues.findEqualityOfValues(0,0,0);
        assertEquals(3, givenAllZeros);
    }

    @Test
    public void givenOneZeroZero() {
        int givenOneZeroZero = equalityOfThreeValues.findEqualityOfValues(1,0,0);
        assertEquals(2, givenOneZeroZero);
    }

    @Test
    public void givenOneZeroTwo() {
        int givenAllZeros = equalityOfThreeValues.findEqualityOfValues(1,0,2);
        assertEquals(0, givenAllZeros);
    }
}
