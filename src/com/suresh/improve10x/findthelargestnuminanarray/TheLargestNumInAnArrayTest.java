package com.suresh.improve10x.findthelargestnuminanarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheLargestNumInAnArrayTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenEmpty_returnZero() {
        TheLargestNumInAnArray theLargestNumInAnArray = new TheLargestNumInAnArray();
        int givenEmpty = theLargestNumInAnArray.findLargestNumInAnArray(new int[] {});
        assertEquals(givenEmpty, 0);
    }
}
