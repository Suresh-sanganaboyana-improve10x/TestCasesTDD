package com.suresh.improve10x.findthediscount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheDiscountTest {

    FindTheDiscount findTheDiscount;

    @BeforeEach
    public void setup() {
        findTheDiscount = new FindTheDiscount();
    }
    @Test
    public void nothing() {
    }

    @Test
    public void givenZero() {
        float givenZero = findTheDiscount.findTheFinalPrice(0, 0);
        assertEquals(0, givenZero);
    }

   /* @Test
    public void givenNegative() {
        float givenHundredAndTen = findTheDiscount.findTheFinalPrice(100.f, -10.f);
        assertEquals(110.0, givenHundredAndTen);
    }*/

    @Test
    public void givenHundredAndTen() {
        float givenHundredAndTen = findTheDiscount.findTheFinalPrice(100.f, 10.f);
        assertEquals(90, givenHundredAndTen);
    }

    @Test
    public void givenThousandAndFifty() {
        float givenThousandAndFifty = findTheDiscount.findTheFinalPrice(1000.f, 50.f);
        assertEquals(500, givenThousandAndFifty);
    }

    @Test
    public void givenNegativeValues() {
        float givenNegativeValues = findTheDiscount.findTheFinalPrice(-1000.f, 50.f);
        assertEquals(-500, givenNegativeValues);
    }

    /*@Test
    public void givenFloatPriceAndFloatDiscount() {
        float givenFloatPriceAndFloatDiscount = findTheDiscount.findTheFinalPrice(1000f, 10.5f);
        assertEquals(895.0, givenFloatPriceAndFloatDiscount);
    }*/

    @Test
    public void givenOneLackAndFive() {
        float givenFloatPriceAndFloatDiscount = findTheDiscount.findTheFinalPrice(100000f, 5f);
        assertEquals(95000, givenFloatPriceAndFloatDiscount);
    }
}
