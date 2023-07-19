package com.suresh.improve10x.shufflename;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShuffleTheNameTest {

    ShuffleTheName shuffleTheName;

    @BeforeEach
    public void setup() {
        shuffleTheName = new ShuffleTheName();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenEmpty_returnEmpty() {
        String givenEmpty = shuffleTheName.getShuffleNames("");
        assertEquals("", givenEmpty);
    }

    @Test
    public void givenNull_returnEmpty() {
        String givenNull = shuffleTheName.getShuffleNames(null);
        assertEquals(null, givenNull);
    }


    @Test
    public void givenName_returnSanginaboinaSuresh() {
        String givenName = shuffleTheName.getShuffleNames("Suresh Sanginaboina");
        assertEquals("Sanginaboina Suresh", givenName);
    }

    @Test
    public void givenRameshSuresh_returnSureshRamesh() {
        String givenName = shuffleTheName.getShuffleNames("Ramesh Suresh");
        assertEquals("Suresh Ramesh", givenName);
    }

}
