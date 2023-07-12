package com.suresh.improve10x.scoring;

public class Scoring {

    public int[] calculateScores(String scores) {
        int[] score = new int[3];
        if (scores != null) {
            for (int i = 0; i < scores.length(); i++) {
                char c = scores.charAt(i);
                if (c == 'A') {
                    score[0]++;
                } else if (c == 'B') {
                    score[1]++;
                } else if (c == 'C') {
                    score[2]++;
                }
            }
        }
        return score;
    }
}
