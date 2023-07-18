package com.suresh.improve10x.hoursandminutesintoseconds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HoursAndMinutesIntoSecondsTest {

    HoursAndMinutesIntoSeconds hoursAndMinutesIntoSeconds;

    @BeforeEach
    public void setup() {
        hoursAndMinutesIntoSeconds = new HoursAndMinutesIntoSeconds();
    }
    @Test
    public void nothing() {}

    @Test
    public void givenZero_returnZero() {
        int zero = hoursAndMinutesIntoSeconds.convertHoursAndMinutesIntoSeconds(0,0);
        assertEquals(0, zero);
    }

    @Test
    public void givenNegativeInputs_returnNegativeSeconds() {
        int negativeInputs = hoursAndMinutesIntoSeconds.convertHoursAndMinutesIntoSeconds(-1, -2);
        assertEquals(-3720, negativeInputs);
    }

    @Test
    public void givenTwoAndOne_returnSevenThousandTwoHundredSixtySeconds() {
        int twoHrsAndOneMin = hoursAndMinutesIntoSeconds.convertHoursAndMinutesIntoSeconds(2, 1);
        assertEquals(7260, twoHrsAndOneMin);
    }

    @Test
    public void givenOneAndOne_returnThreeThousandSixHundredSixty() {
        int givenOneAndOne = hoursAndMinutesIntoSeconds.convertHoursAndMinutesIntoSeconds(1, 1);
        assertEquals(3660, givenOneAndOne);
    }
}
