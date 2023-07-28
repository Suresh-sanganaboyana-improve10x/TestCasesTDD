package com.suresh.improve10x.encryption;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptionTest {

    //The Karaca's Encryption Algorithm
//Make a function that encrypts a given input with these steps:
//Input: "apple"
//Step 1: Reverse the input: "elppa"
//Step 2: Replace all vowels using the following chart:
//a => 0
//e => 1
//i => 2
//o => 3
//u => 4
//// "1lpp0"
//Step 3: Add "aca" to the end of the word: "1lpp0aca"
//Output: "1lpp0aca"
//Examples
//encrypt("banana") ➞ "0n0n0baca"
//encrypt("karaca") ➞ "0c0r0kaca"
//encrypt("burak") ➞ "k0r4baca"
//encrypt("alpaca") ➞ "0c0pl0aca"

    private Encryption encryption;

    @BeforeEach
    public void setup() {
        encryption = new Encryption();
    }
    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnEmpty() {
        String givenNull = encryption.encrypt(null);
        assertEquals("aca", givenNull);
    }

    @Test
    public void givenEmpty_returnEmpty() {
        String givenEmpty = encryption.encrypt("");
        assertEquals("aca", givenEmpty);
    }

    @Test
    public void givenB_returnBaca() {
        String givenB = encryption.encrypt("b");
        assertEquals("baca", givenB);
    }

    @Test
    public void givenC_returnCaca() {
        String givenC = encryption.encrypt("c");
        assertEquals("caca", givenC);
    }

    @Test
    public void givenD_returnDaca() {
        String givenD = encryption.encrypt("d");
        assertEquals("daca", givenD);
    }

    @Test
    public void givenA_return0aca() {
        String givenA = encryption.encrypt("a");
        assertEquals("0aca", givenA);
    }

    @Test
    public void givenE_return1aca() {
        String givenE = encryption.encrypt("e");
        assertEquals("1aca", givenE);
    }

    @Test
    public void givenI_return2aca() {
        String givenI = encryption.encrypt("i");
        assertEquals("2aca", givenI);
    }

    @Test
    public void givenO_return3aca() {
        String givenO = encryption.encrypt("o");
        assertEquals("3aca", givenO);
    }

    @Test
    public void givenU_return4aca() {
        String givenU = encryption.encrypt("u");
        assertEquals("4aca", givenU);
    }

    @Test
    public void givenAb_returnb0aca() {
        String givenAb = encryption.encrypt("ab");
        assertEquals("b0aca", givenAb);
    }

    @Test
    public void givenEb_returnb1aca() {
        String givenEb = encryption.encrypt("eb");
        assertEquals("b1aca", givenEb);
    }

    @Test
    public void givenIb_returnb2aca() {
        String givenIb = encryption.encrypt("ib");
        assertEquals("b2aca", givenIb);
    }

    @Test
    public void givenOb_returnb3aca() {
        String givenOb = encryption.encrypt("ob");
        assertEquals("b3aca", givenOb);
    }

    @Test
    public void givenUb_returnb4aca() {
        String givenOb = encryption.encrypt("ub");
        assertEquals("b4aca", givenOb);
    }

    @Test
    public void givenbca_return0cbaca() {
        String givenbca = encryption.encrypt("bca");
        assertEquals("0cbaca", givenbca);
    }

    @Test
    public void givenApple_return1lpp0aca() {
        String givenbca = encryption.encrypt("apple");
        assertEquals("1lpp0aca", givenbca);
    }

    @Test
    public void givenbanana_return0n0n0baca() {
        String givenbca = encryption.encrypt("banana");
        assertEquals("0n0n0baca", givenbca);
    }

    @Test
    public void givenkaraca_return0c0r0kaca() {
        String givenkaraca = encryption.encrypt("karaca");
        assertEquals("0c0r0kaca", givenkaraca);
    }

    @Test
    public void givenburak_returnk0r4baca() {
        String givenburak = encryption.encrypt("burak");
        assertEquals("k0r4baca", givenburak);
    }

    @Test
    public void givenalpaca_return0c0pl0aca() {
        String givenalpaca = encryption.encrypt("alpaca");
        assertEquals("0c0pl0aca", givenalpaca);
    }

    @Test
    public void givenCapital_return0c0pl0aca() {
        String givenCapital = encryption.encrypt("APPLE");
        assertEquals("1lpp0aca", givenCapital);
    }

    @Test
    public void givenSpaceText_return0c0pl0aca() {
        String givenCapital = encryption.encrypt(" APPLE ");
        assertEquals("1lpp0aca", givenCapital);
    }
}
