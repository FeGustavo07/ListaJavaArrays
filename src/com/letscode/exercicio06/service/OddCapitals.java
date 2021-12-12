package com.letscode.exercicio06.service;

public class OddCapitals {

    public static String wordWithOddCapitals(String word) {
        char[] wordArray = word.toCharArray();
        int i = 0;
        for (char letter : wordArray) {
            char newLetter;
            if (i % 2 == 1) {
                newLetter = Character.toUpperCase(letter);
                wordArray[i] = newLetter;
            }
            else {
                newLetter = Character.toLowerCase(letter);
                wordArray[i] = newLetter;
            }
            i++;
        }
        word = String.copyValueOf(wordArray);
        return word;
    }

}
