package com.suresh.improve10x.syahellobye;

public class SayHelloBye {
    public String getHelloBye( int num, String name) {
        String result = "";
        if (num == 0) {
            result = "Bye" +" "+ name;
        } else if (num == 1) {
            result = "Hello" + " " + name;
        } else {
            result = "Invalid";
        }
        return result;
    }
}
