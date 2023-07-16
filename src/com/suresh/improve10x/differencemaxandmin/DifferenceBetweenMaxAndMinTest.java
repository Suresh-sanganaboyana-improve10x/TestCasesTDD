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
    public void givenZero() {
        Integer givenZero = DifferenceMaxAndMin.findDifferenceBetweenMaxAndMin(new int[] {0});
        assertEquals(0, givenZero);
    }

    @Test
    public void givenNegativeNumbers() {
        Integer givenNegativeNumbers = DifferenceMaxAndMin.findDifferenceBetweenMaxAndMin(new int[] {1,4,-50, 32,19});
        assertEquals(82, givenNegativeNumbers);
    }

    @Test
    public void givenLargeArray() {
        Integer givenNegativeNumbers = DifferenceMaxAndMin.findDifferenceBetweenMaxAndMin(new int[] {33, 22, 66, 3, 245});
        assertEquals(242, givenNegativeNumbers);
    }
}
