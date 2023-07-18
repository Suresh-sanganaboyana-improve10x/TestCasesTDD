package com.suresh.improve10x.findthebomb;

public class FindTheBomb {
    public String findBomb(String text) {
        String result = "";
        if (text == null) {
            return null;
        }
        String lowerCase = text.toLowerCase();
        if (text.equals("")) {
            result = "";
        } else if (lowerCase.contains("bomb")) {
            result = "Duck";
        } else {
            result = "Relax There is no bomb";
        }
        return result;
    }
}
