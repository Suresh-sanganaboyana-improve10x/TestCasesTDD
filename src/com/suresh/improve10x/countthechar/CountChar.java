package com.suresh.improve10x.countthechar;

public class CountChar {
    public int getCharCount(String text, char c) {
        if (text == null) {
            return 0;
        }
        int noOfChars = 0;
        String lowerCase = text.toLowerCase();
        String charInString = String.valueOf(c);
        charInString.toLowerCase();
        for (int i = 0; i<lowerCase.length(); i++) {
            if (c == lowerCase.charAt(i)) {
                noOfChars++;
            }
        }
        return noOfChars;
    }
}
