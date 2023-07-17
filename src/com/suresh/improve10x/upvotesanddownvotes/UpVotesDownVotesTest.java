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
    public void givenTwoZero() {
        int givenTwoZeros = upVotesDownVotes.getUpVotesVsDownVotes(0, 0);
        assertEquals(0, givenTwoZeros);
    }

    @Test
    public void givenOneTwo() {
        int givenOneTwo = upVotesDownVotes.getUpVotesVsDownVotes(1, 2);
        assertEquals(-1, givenOneTwo);
    }

    @Test
    public void givenThirteenAndZero() {
        int givenThirteenAndZero = upVotesDownVotes.getUpVotesVsDownVotes(13, 0);
        assertEquals(13, givenThirteenAndZero);
    }

    @Test
    public void givenTwoAndThirtyThree() {
        int givenThirteenAndZero = upVotesDownVotes.getUpVotesVsDownVotes(2, 33);
        assertEquals(-31, givenThirteenAndZero);
    }

    @Test
    public void givenOneThirtyTwoAndOneThirtyTwo() {
        int givenOneThirtyTwoAndOneThirtyTwo = upVotesDownVotes.getUpVotesVsDownVotes(132, 132);
        assertEquals(0, givenOneThirtyTwoAndOneThirtyTwo);
    }
}
