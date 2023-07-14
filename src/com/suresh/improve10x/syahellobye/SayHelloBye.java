package com.suresh.improve10x.syahellobye;

public class SayHelloBye {
    public String getHelloBye( int num, String name) {
        if (name.equals("")) {
            return "Give Name";
        } else {
            if (num == 0) {
                return "Bye" + " " + name.substring(0, 1).toUpperCase() + name.substring(1);
            } else if (num == 1) {
                return "Hello" + " " + name.substring(0, 1).toUpperCase() + name.substring(1);
            } else {
                return "Invalid";
            }
        }
    }
}
