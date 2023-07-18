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
    public void givenOneZeroTwo_returnZero() {
        int givenOneZeroTwo = equalityOfThreeValues.findEqualityOfThreeValues(1,0,2);
        assertEquals(0, givenOneZeroTwo);
    }

    @Test
    public void givenAllZeros_returnThree() {
        int givenAllZeros = equalityOfThreeValues.findEqualityOfThreeValues(0,0,0);
        assertEquals(3, givenAllZeros);
    }

    @Test
    public void givenOneZeroZero_returnTwo() {
        int givenOneZeroZero = equalityOfThreeValues.findEqualityOfThreeValues(1,0,0);
        assertEquals(2, givenOneZeroZero);
    }



    @Test
    public void givenTwoOneTwo_returnTwo() {
        int givenTwoOneTwo = equalityOfThreeValues.findEqualityOfThreeValues(2,1,2);
        assertEquals(2, givenTwoOneTwo);
    }
}
