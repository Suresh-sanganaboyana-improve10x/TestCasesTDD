package com.suresh.improve10x.minutesintoseconds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinutesIntoSecondsTest {

    MinutesIntoSeconds minutesIntoSeconds;

    @BeforeEach
    public void setup() {
        minutesIntoSeconds = new MinutesIntoSeconds();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenZero_returnZero() {
        int zeroSecond = minutesIntoSeconds.convertMinutesIntoSeconds(0);
        assertEquals(0, zeroSecond);
    }

    @Test
    public void givenNegativeInput_returnNegative() {
        int negativeNum = minutesIntoSeconds.convertMinutesIntoSeconds(-1);
        assertEquals(-60, negativeNum);
    }

    @Test
    public void givenOne_returnSixtySeconds() {
        int oneMinute = minutesIntoSeconds.convertMinutesIntoSeconds(1);
        assertEquals(60, oneMinute);
    }

    @Test
    public void givenSixtyMinutes_returnThreeThousandSixHundred() {
        int sixtyMinutes = minutesIntoSeconds.convertMinutesIntoSeconds(60);
        assertEquals(3600, sixtyMinutes);
    }
}
