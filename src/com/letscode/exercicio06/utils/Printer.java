package com.letscode.exercicio06.utils;

import com.letscode.exercicio06.service.OddCapitals;

public class Printer {

    static final String MESSAGE_TYPE_A_WORD = "Type a word: ";

    public static void messageTypeWord() {
        System.out.print(MESSAGE_TYPE_A_WORD);
    }

    public static void getModifiedWord(String word) {
        System.out.println(OddCapitals.wordWithOddCapitals(word));
    }

}
