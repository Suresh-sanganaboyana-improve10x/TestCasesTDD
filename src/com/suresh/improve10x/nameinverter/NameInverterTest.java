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
    public void givenMrsHonorifics_ignoreHonorifics() {
        String nameInverted = nameInverter.getNameInverted("Mrs. first last");
        assertEquals("last, first", nameInverted);
    }

    @Test
    public void givenMrHonorifics_ignoreHonorifics() {
        String nameInverted = nameInverter.getNameInverted("Mr. first last");
        assertEquals("last, first", nameInverted);
    }

    @Test
    public void givenNameAndPostNominal_stayAtEnd() {
        String nominal = nameInverter.getNameInverted("first last Bcom.");
        assertEquals("last, first Bcom.", nominal);
    }

    @Test
    public void givenNameAndMultiplePostNominal_stayAtEnd() {
        String nominal = nameInverter.getNameInverted("first last Bcom. MBA.");
        assertEquals("last, first Bcom. MBA.", nominal);
    }

    @Test
    public void integrationTest() {
        String nameInverted = nameInverter.getNameInverted("Mr. Sanginaboina Suresh Application Developer");
        assertEquals("Suresh, Sanginaboina Application Developer", nameInverted);
    }
}
