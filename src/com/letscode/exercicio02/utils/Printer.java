package com.letscode.exercicio02.utils;

import com.letscode.exercicio02.service.ReverseWord;

import java.util.Arrays;

public class Printer {

    static final String MESSAGE_WRITE_WORD = "Write a word: ";

    public static void messageWriteWord() {
        System.out.print(MESSAGE_WRITE_WORD);
    }

    public static void getRevertedWord(String word) {
        System.out.println(ReverseWord.reverseWord(word));
    }

}
