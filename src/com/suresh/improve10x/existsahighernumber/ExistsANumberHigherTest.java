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
    public void givenEmpty_returnFalse() {
        Boolean givenEmpty = existsANumberHigher.isNumberHigher(new int[] {}, 0);
        assertEquals(false, givenEmpty);
    }

    @Test
    public void givenNegativeTwo_returnFalse() {
        Boolean givenNegativeArr = existsANumberHigher.isNumberHigher(new int[] {-2} , 2);
        assertEquals(false, givenNegativeArr);
    }

    @Test
    public void givenNegativeArr_returnTrue() {
        Boolean givenNegativeArr = existsANumberHigher.isNumberHigher(new int[] {-1, -4, -3, -9, -10} , -11);
        assertEquals(true, givenNegativeArr);
    }

    @Test
    public void givenNumAsZero_returnTrue() {
        Boolean givenNumAsZero = existsANumberHigher.isNumberHigher(new int[] {1, 4, 63, 6}, 0);
        assertEquals(true, givenNumAsZero);
    }

    @Test
    public void givenBothZero_returnTrue() {
        Boolean givenZero = existsANumberHigher.isNumberHigher(new int[] {0}, 0);
        assertEquals(true, givenZero);
    }

    @Test
    public void givenSomeValues_returnTrue() {
        Boolean givenSomeValues = existsANumberHigher.isNumberHigher(new int[] {1, 5, 3, 7, 856, 90} , 85 );
        assertEquals(true, givenSomeValues);
    }

    @Test
    public void givenBigValues_returnFalse() {
        Boolean givenBigValues = existsANumberHigher.isNumberHigher(new int[] {223, 444, 22, 765, 890} , 891 );
        assertEquals(false, givenBigValues);
    }

}
