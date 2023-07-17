package com.suresh.improve10x.findmissingnumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMissingNumberTest {

    FindMissingNumber findMissingNumber;

    @BeforeEach
    public void setup() {
        findMissingNumber = new FindMissingNumber();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenEmptyArray() {
        int givenEmpty = findMissingNumber.missingNum(new int[] {});
        assertEquals( 0, givenEmpty);
    }

    @Test
    public void givenOneToTenNumbers() {
        int givenOneToTenNumbers = findMissingNumber.missingNum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 10});
        assertEquals( 9, givenOneToTenNumbers);
    }

    @Test
    public void givenUnSortedArray() {
        int givenUnSortedArray = findMissingNumber.missingNum(new int[] {10, 2, 6, 8, 1, 5, 4, 7, 9});
        assertEquals( 3, givenUnSortedArray);
    }

    @Test
    public void givenDesigndingOrder() {
        int givenDesigndingOrder = findMissingNumber.missingNum(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2});
        assertEquals( 1, givenDesigndingOrder);
    }
}
