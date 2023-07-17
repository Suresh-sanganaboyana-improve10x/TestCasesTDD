package com.suresh.improve10x.upvotesanddownvotes;

public class UpVotesDownVotes {
    public int getUpVotesVsDownVotes(int upVotes, int downVotes) {
        int voteCount = upVotes - downVotes;
        return voteCount;
    }
}
