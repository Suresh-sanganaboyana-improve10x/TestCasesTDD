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
    public void givenAllZeros() {
        int givenAllZeros = theFormAnimals.getTotalAnimalLegs(0, 0, 0);
        assertEquals(0, givenAllZeros);
    }

    @Test
    public void givenNegative() {
        int givenNegative = theFormAnimals.getTotalAnimalLegs(-1, -1, -1);
        assertEquals(-1, givenNegative);
    }

    @Test
    public void givenChickenOne() {
        int givenChickenOne = theFormAnimals.getTotalAnimalLegs(1, 0, 0);
        assertEquals(2, givenChickenOne);
    }

    @Test
    public void givenCowOne() {
        int givenCowOne = theFormAnimals.getTotalAnimalLegs(0, 1, 0);
        assertEquals(4, givenCowOne);
    }

    @Test
    public void givenPigOne() {
        int givenPigOne = theFormAnimals.getTotalAnimalLegs(0, 0, 1);
        assertEquals(4, givenPigOne);
    }

    @Test
    public void givenChickenOneCowOnePigZero() {
        int givenChickenOneCowOnePigZero = theFormAnimals.getTotalAnimalLegs(1, 1, 0);
        assertEquals(6, givenChickenOneCowOnePigZero);
    }

    @Test
    public void givenChickenZeroCowOnePigOne() {
        int givenPigOne = theFormAnimals.getTotalAnimalLegs(0, 1, 1);
        assertEquals(8, givenPigOne);
    }

    @Test
    public void givenOneOneOne() {
        int givenOneOneOne = theFormAnimals.getTotalAnimalLegs(1, 1, 1);
        assertEquals(10, givenOneOneOne);
    }

    @Test
    public void givenTwoOneOne() {
        int givenTwoOneOne = theFormAnimals.getTotalAnimalLegs(2, 1, 1);
        assertEquals(12, givenTwoOneOne);
    }

    @Test
    public void givenOneTwoOne() {
        int givenOneTwoOne = theFormAnimals.getTotalAnimalLegs(1, 2, 1);
        assertEquals(14, givenOneTwoOne);
    }

    @Test
    public void givenOneOneTwo() {
        int givenOneTwoOne = theFormAnimals.getTotalAnimalLegs(1, 1, 2);
        assertEquals(14, givenOneTwoOne);
    }
}
