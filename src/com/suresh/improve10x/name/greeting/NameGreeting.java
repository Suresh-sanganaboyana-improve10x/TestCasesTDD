package com.suresh.improve10x.name.greeting;

public class NameGreeting {
    public String getGreetingName(String name) {
        if (name.equals("")) {
            return "";
        } else {
            return "Hello " + name + "!";
        }
    }
}
