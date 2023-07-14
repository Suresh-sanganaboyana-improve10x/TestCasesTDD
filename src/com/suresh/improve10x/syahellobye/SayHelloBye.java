package com.suresh.improve10x.syahellobye;

public class SayHelloBye {
    public String getHelloBye( int num, String name) {
        String result = "";
        if (num == 0) {
            result = "Bye" +" "+ name.substring(0,1).toUpperCase() + name.substring(1);
        } else if (num == 1) {
            result = "Hello" + " " + name.substring(0,1).toUpperCase() + name.substring(1);
        } else if (name.equals("")) {
            result = "Bye Invalid character";
        } else {
            result = "Invalid";
        }
        return result;
    }
}
