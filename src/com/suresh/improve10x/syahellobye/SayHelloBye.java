package com.suresh.improve10x.syahellobye;

public class SayHelloBye {
    public String getHelloByeWithName(int num, String name) {
        String result = "";
        if (name == null) {
            return null;
        }
        if (!name.equals("")) {
            if (num == 0) {
                result = "Bye" +" "+ name.substring(0,1).toUpperCase() + name.substring(1);
            } else if (num == 1) {
                result = "Hello" +" "+ name.substring(0, 1).toUpperCase() + name.substring(1);
            } else {
                result = "Invalid";
            }
        }
        return result;
    }
}