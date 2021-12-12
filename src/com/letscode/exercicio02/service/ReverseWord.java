package com.letscode.exercicio02.service;

import java.lang.reflect.Array;

public class ReverseWord {

    public static String reverseWord(String word) {
        char[] wordArray = word.toCharArray();
        char[] revertedWordArray = new char[wordArray.length];
        int c = 0;
        for (int i = revertedWordArray.length -1; i >= 0; i--) {
            revertedWordArray[c] = wordArray[i];
            c++;
        }
        word = String.copyValueOf(revertedWordArray);
        return word;
    }

}
