package com.suresh.improve10x.specialarrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SpecialArraysTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenFalseInput_returnFalse() throws SpecialArray.InvalidArrayException {
        SpecialArray specialArray = new SpecialArray();
        Boolean givenFalse = specialArray.isSpecialArray(new Integer[] {1,2,1,1});
        assertEquals(false, givenFalse);
    }

    @Test
    public void givenNull_returnFalse() {
        SpecialArray specialArray = new SpecialArray();
        assertThrows(SpecialArray.InvalidArrayException.class, () -> specialArray.isSpecialArray(null), "Invalid input");
    }

    @Test
    public void givenEmpty_returnFalse() {
        SpecialArray specialArray = new SpecialArray();
        assertThrows(SpecialArray.InvalidArrayException.class, () -> specialArray.isSpecialArray(new Integer[]{}), "Invalid input");
    }

    @Test
    public void givenArray_returnTrue() throws SpecialArray.InvalidArrayException {
        SpecialArray specialArray = new SpecialArray();
        Boolean givenArray = specialArray.isSpecialArray(new Integer[] {2, 7, 4, 9, 6, 1, 6, 3});
        assertEquals(true, givenArray);
    }

    @Test
    public void givenFalseInput_returnTrue() throws SpecialArray.InvalidArrayException {
        SpecialArray specialArray = new SpecialArray();
        Boolean given1234 = specialArray.isSpecialArray(new Integer[] {2, 7, 8, 8, 6, 1, 6, 3});
        assertEquals(false, given1234);
    }

    @Test
    public void givenTrue_returnTrue() throws SpecialArray.InvalidArrayException {
        SpecialArray specialArray = new SpecialArray();
        Boolean given1234 = specialArray.isSpecialArray(new Integer[] {2, 7, 8, 8, 6, 1, 6, 3});
        assertEquals(false, given1234);
    }
}
