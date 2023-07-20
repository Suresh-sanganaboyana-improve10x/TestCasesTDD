package com.suresh.improve10x.upvotesanddownvotes;

public class UpVotesDownVotes {
    public int getUpVotesVsDownVotes(int upVotes, int downVotes) {
        int voteCount = 0;
        if (upVotes < 0 && downVotes < 0) {
            voteCount = -1;
        } else {
            voteCount = upVotes - downVotes;
        }
        return voteCount;
    }
}
