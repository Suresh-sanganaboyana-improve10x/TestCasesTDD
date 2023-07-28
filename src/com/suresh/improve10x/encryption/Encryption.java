package com.suresh.improve10x.encryption;

public class Encryption {
    public String encrypt(String word) {
        String result = "";
        if (word == null || word.equals("")) {
            return "aca";
        } else {
            String reverse = "";
            for (int i = word.length()-1; i >= 0;  i--) {
                reverse = reverse + word.toLowerCase().charAt(i);
            }
            char[] replacedVowels = reverse.toCharArray();
            for (int i = 0; i < reverse.length(); i++) {
                if (reverse.charAt(i) == 'a') {
                    replacedVowels[i] = '0';
                } else if (reverse.charAt(i) == 'e') {
                    replacedVowels[i] = '1';
                } else if (reverse.charAt(i) == 'i') {
                    replacedVowels[i] = '2';
                } else if (reverse.charAt(i) == 'o') {
                    replacedVowels[i] = '3';
                } else if (reverse.charAt(i) == 'u') {
                    replacedVowels[i] = '4';
                }
            }
            String replace = String.valueOf(replacedVowels);
            result = replace.trim() + "aca";
            return result;
        }
    }
}
