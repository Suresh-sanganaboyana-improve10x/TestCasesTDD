package com.suresh.improve10x.theformproblem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheFormTest {

    TheFormAnimals theFormAnimals;

    @BeforeEach
    public void setup() {
        theFormAnimals = new TheFormAnimals();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenOneOneOne() {
        int givenOneOneOne = theFormAnimals.getTotalAnimalLegs(1, 1, 1);
        assertEquals(10, givenOneOneOne);
    }

    @Test
    public void givenAllZeros() {
        int givenAllZeros = theFormAnimals.getTotalAnimalLegs(0, 0, 0);
        assertEquals(0, givenAllZeros);
    }

    @Test
    public void givenNegative() {
        int givenAllZeros = theFormAnimals.getTotalAnimalLegs(-1, -1, -1);
        assertEquals(-10, givenAllZeros);
    }

    @Test
    public void givenFourFiveTen() {
        int givenAllZeros = theFormAnimals.getTotalAnimalLegs(4, 5, 10);
        assertEquals(68, givenAllZeros);
    }

    @Test
    public void givenTwentyFourFive() {
        int givenAllZeros = theFormAnimals.getTotalAnimalLegs(20, 4, 5);
        assertEquals(76, givenAllZeros);
    }
}
