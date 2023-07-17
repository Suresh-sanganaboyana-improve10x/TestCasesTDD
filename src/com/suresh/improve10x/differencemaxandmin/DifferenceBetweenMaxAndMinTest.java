package com.suresh.improve10x.differencemaxandmin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DifferenceBetweenMaxAndMinTest {

    DifferenceMaxAndMin differenceMaxAndMin;

    @BeforeEach
    public void setup() {
        differenceMaxAndMin = new DifferenceMaxAndMin();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenZero_returnZero() {
        Integer givenZero = DifferenceMaxAndMin.findDifferenceBetweenMaxAndMin(new int[] {0});
        assertEquals(0, givenZero);
    }

    @Test
    public void givenAllNegativeNumbers_returnSeven() {
        Integer givenAllNegativeNumbers = DifferenceMaxAndMin.findDifferenceBetweenMaxAndMin(new int[] {-2, -5, -9, -5, -4, -3});
        assertEquals(7, givenAllNegativeNumbers);
    }

    @Test
    public void givenNegativeAndPositiveNumbers_returnEightyTwo() {
        Integer givenNegativeNumbers = DifferenceMaxAndMin.findDifferenceBetweenMaxAndMin(new int[] {1, 4, -50, 32, 19});
        assertEquals(82, givenNegativeNumbers);
    }

    @Test
    public void givenLargeArray_returnTwoHundredFourtyTwo() {
        Integer givenLargeArray = DifferenceMaxAndMin.findDifferenceBetweenMaxAndMin(new int[] {33, 22, 66, 3, 245});
        assertEquals(242, givenLargeArray);
    }

    @Test
    public void givenBigArray_returnBigDifference() {
        Integer givenBigArray = DifferenceMaxAndMin.findDifferenceBetweenMaxAndMin(new int[] {21, 2433, 342, 22, 66, 567, 5, 245, 99, 345, 235,2433});
        assertEquals(2428, givenBigArray);
    }
}
