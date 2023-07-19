package com.suresh.improve10x.syahellobye;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SayHelloByeTest {

    SayHelloBye sayHelloBye;

    @BeforeEach
    public void setup() {
        sayHelloBye = new SayHelloBye();
    }
    @Test
    public void nothing() {}

    @Test
    public void givenEmpty_returnEmpty() {
        String givenOneName = sayHelloBye.getHelloByeWithName(0, "");
        assertEquals("", givenOneName);
    }

    @Test
    public void givenZeroEmpty_returnByeEmpty() {
        String givenOneName = sayHelloBye.getHelloByeWithName(4, "");
        assertEquals("", givenOneName);
    }

    @Test
    public void givenNull_returnNull() {
        String givenOneName = sayHelloBye.getHelloByeWithName(4, null);
        assertEquals(null, givenOneName);
    }

    @Test
    public void giveZero_returnByeName() {
        String givenZero = sayHelloBye.getHelloByeWithName(0, "Mani");
        assertEquals("Bye Mani", givenZero);
    }

    @Test
    public void givenOneName_returnHelloName() {
        String givenOneName = sayHelloBye.getHelloByeWithName(1, "Suresh");
        assertEquals("Hello Suresh", givenOneName);
    }

    @Test
    public void givenOneSmallName_returnHelloFirstLetterCap() {
        String givenOneName = sayHelloBye.getHelloByeWithName(1, "charan");
        assertEquals("Hello Charan", givenOneName);
    }

    @Test
    public void givenNegativeOne_returnInvalid() {
        String givenNegative = sayHelloBye.getHelloByeWithName(-1, "Akhil");
        assertEquals("Invalid", givenNegative);
    }
}
