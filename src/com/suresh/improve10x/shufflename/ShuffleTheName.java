package com.suresh.improve10x.shufflename;

public class ShuffleTheName {
    public String getShuffleNames(String name) {
        String result = "";
        if (name != null) {
            if (!name.equals("")) {
                String[] names = name.split(" ");
                result = names[1] + " " + names[0];
            }
        }
        return result;
    }
}
