package com.suresh.improve10x.nameinverter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameInverterTest {

    NameInverter nameInverter;

    @BeforeEach
    public void setup() {
        nameInverter= new NameInverter();
    }
    @Test
    public void nothing() {}

    @Test
    public void givenEmpty_returnEmpty() {
        NameInverter nameInverter = new NameInverter();
        String invertedEmpty = nameInverter.getNameInverted("");
        assertEquals("", invertedEmpty);
    }

    @Test
    public void givenSingleWord_returnSingleWord() {
        String nameInverted = nameInverter.getNameInverted("Suresh");
        assertEquals("Suresh", nameInverted);
    }

    @Test
    public void givenNameWithSpace_returnName() {
        String nameInverted = nameInverter.getNameInverted("Surya ");
        assertEquals("Surya", nameInverted);
    }

    @Test
    public void givenNameWithSpaceBeginningAndEnding_returnName() {
        String nameInverted = nameInverter.getNameInverted("  Praveen  ");
        assertEquals("Praveen", nameInverted);
    }

    @Test
    public void givenFirstLast_returnLastFirst() {
        String nameInverted = nameInverter.getNameInverted("First Last");
        assertEquals("Last, First", nameInverted);
    }

    @Test
    public void givenHonorifics_ignoreHonorifics() {
        String nameInverted = nameInverter.getNameInverted("Mrs. first last");
        assertEquals("last, first", nameInverted);
    }
}
