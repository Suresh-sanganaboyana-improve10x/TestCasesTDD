package com.suresh.improve10x.findthebomb;

public class FindTheBomb {
    public String findBomb(String word) {
        String result = "";
        String lowerCase = word.toLowerCase();
        if (lowerCase.contains("bomb")) {
            result = "Duck";
        } else {
            result = "Relax There is no bomb";
        }
        return result;
    }
}
