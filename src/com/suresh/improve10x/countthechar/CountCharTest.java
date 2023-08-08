package com.suresh.improve10x.countthechar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountCharTest {

    private CountChar countChar;

    @BeforeEach
    public void setup() {
        countChar = new CountChar();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenEmpty_returnZero() {
        CountChar countChar = new CountChar();
        int givenEmpty = countChar.getCharCount("");
        assertEquals(0, givenEmpty);
    }
}
