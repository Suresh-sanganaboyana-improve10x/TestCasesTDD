package com.suresh.improve10x.name.greeting;

public class NameGreeting {
    public String getGreetingName(String name) {
        if (name == null) {
            return null;
        } else if (name.equals("")) {
            return "";
        } else {
            return "Hello " + name + "!";
        }
    }
}
