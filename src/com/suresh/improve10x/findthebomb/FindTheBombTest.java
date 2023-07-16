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
    public void givenEmpty() {
        String givenEmpty = findTheBomb.findBomb("");
        assertEquals("Relax There is no bomb", givenEmpty);
    }

    @Test
    public void givenSureshBomb() {
        String givenSureshBomb = findTheBomb.findBomb("Suresh bomb");
        assertEquals("Duck", givenSureshBomb);
    }

    @Test
    public void givenThereIsBomb() {
        String givenThereIsBomb = findTheBomb.findBomb("There is bomb");
        assertEquals("Duck", givenThereIsBomb);
    }

    @Test
    public void givenCapitalBomb() {
        String givenCapitalBomb = findTheBomb.findBomb("There is Bomb");
        assertEquals("Duck", givenCapitalBomb);
    }

    @Test
    public void givenBombWithInterGenction() {
        String givenCapitalBomb = findTheBomb.findBomb("There is Bomb!");
        assertEquals("Duck", givenCapitalBomb);
    }
}
