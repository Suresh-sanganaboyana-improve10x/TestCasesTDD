package com.suresh.improve10x.findthebomb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheBombTest {

    FindTheBomb findTheBomb;

    @BeforeEach
    public void setup() {
        findTheBomb = new FindTheBomb();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenEmpty_returnEmpty() {
        String givenEmpty = findTheBomb.findBomb("");
        assertEquals("", givenEmpty);
    }

    @Test
    public void givenNull_returnNull() {
        String givenNull = findTheBomb.findBomb(null);
        assertEquals(null, givenNull);
    }

    @Test
    public void givenSureshBomb() {
        String givenSureshBomb = findTheBomb.findBomb("Russia bomb");
        assertEquals("Duck", givenSureshBomb);
    }

    @Test
    public void givenThereIsBomb() {
        String givenThereIsBomb = findTheBomb.findBomb("There is a bomb");
        assertEquals("Duck", givenThereIsBomb);
    }

    @Test
    public void givenCapitalBomb() {
        String givenCapitalBomb = findTheBomb.findBomb("There is a capital Bomb");
        assertEquals("Duck", givenCapitalBomb);
    }

    @Test
    public void givenBombWithNot() {
        String givenBombWithNot = findTheBomb.findBomb("There is Bomb!");
        assertEquals("Duck", givenBombWithNot);
    }

    @Test
    public void givenOneText() {
        String givenCapitalBomb = findTheBomb.findBomb("There is Duck and cow");
        assertEquals("Relax There is no bomb", givenCapitalBomb);
    }
}
