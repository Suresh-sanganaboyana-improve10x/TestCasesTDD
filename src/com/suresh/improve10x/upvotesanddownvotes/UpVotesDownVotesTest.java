package com.suresh.improve10x.upvotesanddownvotes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpVotesDownVotesTest {

    UpVotesDownVotes upVotesDownVotes;

    @BeforeEach
    public void setup() {
        upVotesDownVotes = new UpVotesDownVotes();
    }
    @Test
    public void nothing() {}

    @Test
    public void givenTwoZeros_returnZero() {
        int givenTwoZeros = upVotesDownVotes.getUpVotesVsDownVotes(0, 0);
        assertEquals(0, givenTwoZeros);
    }

    @Test
    public void givenNegative_returnMinusOne() {
        int givenNegative = upVotesDownVotes.getUpVotesVsDownVotes(-1, -10);
        assertEquals(-1, givenNegative);
    }

    @Test
    public void givenOneTwo_returnMinusOne() {
        int givenOneTwo = upVotesDownVotes.getUpVotesVsDownVotes(1, 2);
        assertEquals(-1, givenOneTwo);
    }

    @Test
    public void givenThirteenAndZero_returnThirteen() {
        int givenThirteenAndZero = upVotesDownVotes.getUpVotesVsDownVotes(13, 0);
        assertEquals(13, givenThirteenAndZero);
    }

    @Test
    public void givenThirteenAndThree_returnTen() {
        int givenThirteenAndZero = upVotesDownVotes.getUpVotesVsDownVotes(13, 3);
        assertEquals(10, givenThirteenAndZero);
    }

    @Test
    public void givenTwoAndThirtyThree_returnMinusThirtyOne() {
        int givenTwoAndThirtyThree = upVotesDownVotes.getUpVotesVsDownVotes(2, 33);
        assertEquals(-31, givenTwoAndThirtyThree);
    }

    @Test
    public void givenOneThirtyTwoAndOneThirtyTwo_returnZero() {
        int givenOneThirtyTwoAndOneThirtyTwo = upVotesDownVotes.getUpVotesVsDownVotes(132, 132);
        assertEquals(0, givenOneThirtyTwoAndOneThirtyTwo);
    }
}
