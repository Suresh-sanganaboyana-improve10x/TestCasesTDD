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
        int givenEmpty = countChar.getCharCount("", 'a');
        assertEquals(0, givenEmpty);
    }

    @Test
    public void givenNull_returnZero() {
        int givenNull = countChar.getCharCount(null, 'a');
        assertEquals(0, givenNull);
    }

    @Test
    public void givenA_returnOne() {
        int givenA = countChar.getCharCount("a", 'a');
        assertEquals(1, givenA);
    }

    @Test
    public void givenAB_returnOne() {
        int givenAB = countChar.getCharCount("ab", 'b');
        assertEquals(1, givenAB);
    }

    @Test
    public void givenAAB_returnTwo() {
        int givenAAB = countChar.getCharCount("aab", 'a');
        assertEquals(2, givenAAB);
    }

    @Test
    public void givenAAABB_returnThree() {
        int givenAABB = countChar.getCharCount("AaAb", 'a');
        assertEquals(3, givenAABB);
    }

    @Test
    public void givenABB_returnTwo() {
        int givenABB = countChar.getCharCount("Abb", 'b');
        assertEquals(2, givenABB);
    }

    @Test
    public void givenABBCapitalB_returnOne() {
        int givenABB = countChar.getCharCount("ABB", 'b');
        assertEquals(2, givenABB);
    }
}
