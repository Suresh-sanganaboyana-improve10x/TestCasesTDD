package com.suresh.improve10x.existsahighernumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExistsANumberHigherTest {

    ExistsANumberHigher existsANumberHigher;

    @BeforeEach
    public void setup() {
        existsANumberHigher = new ExistsANumberHigher();
    }
    @Test
    public void nothing() {}

    @Test
    public void givenEmpty() {
        Boolean givenEmpty = existsANumberHigher.isNumberHigher(new int[] {}, 0);
        assertEquals(false, givenEmpty);
    }

    @Test
    public void givenNumAsZero() {
        Boolean givenNumAsZero = existsANumberHigher.isNumberHigher(new int[] {1, 4, 63, 6}, 0);
        assertEquals(true, givenNumAsZero);
    }

    @Test
    public void givenInArrayZero() {
        Boolean givenZero = existsANumberHigher.isNumberHigher(new int[] {0}, 0);
        assertEquals(true, givenZero);
    }

    @Test
    public void givenSomeValues() {
        Boolean givenSomeValues = existsANumberHigher.isNumberHigher(new int[] {1, 5, 3, 7, 856, 90} , 85 );
        assertEquals(true, givenSomeValues);
    }

    @Test
    public void givenBigValues() {
        Boolean givenBigValues = existsANumberHigher.isNumberHigher(new int[] {223, 444, 22, 765, 890} , 889 );
        assertEquals(true, givenBigValues);
    }

}
