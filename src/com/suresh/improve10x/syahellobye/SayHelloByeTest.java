package com.suresh.improve10x.syahellobye;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SayHelloByeTest {

    @Test
    public void nothing() {}

    @Test
    public void emptyName_returnByeEmpty() {
        SayHelloBye sayHelloBye = new SayHelloBye();
        String givenEmpty = sayHelloBye.getHelloBye(0, "");
        assertEquals("Bye"+ "", givenEmpty);
    }
}
