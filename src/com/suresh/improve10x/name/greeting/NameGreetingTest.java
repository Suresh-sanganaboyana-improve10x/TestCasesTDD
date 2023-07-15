package com.suresh.improve10x.name.greeting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameGreetingTest {

    NameGreeting nameGreeting;

    @BeforeEach
    public void setup() {
        nameGreeting = new NameGreeting();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenEmpty() {
        String givenEmpty = nameGreeting.getGreetingName("");
        assertEquals("", givenEmpty);
    }

    @Test
    public void givenName() {
        String givenName = nameGreeting.getGreetingName("Suresh");
        assertEquals("Hello Suresh!", givenName);
    }

    @Test
    public void givenSurya() {
        String givenName = nameGreeting.getGreetingName("Surya");
        assertEquals("Hello Surya!", givenName);
    }

    @Test
    public void given() {
        String givenName = nameGreeting.getGreetingName("Surya");
        assertEquals("Hello Surya!", givenName);
    }

    @Test
    public void givenSpace() {
        String givenName = nameGreeting.getGreetingName(" ");
        assertEquals("Hello  !", givenName);
    }

    @Test
    public void givenPeople() {
        String givenName = nameGreeting.getGreetingName("People");
        assertEquals("Hello People!", givenName);
    }
}
