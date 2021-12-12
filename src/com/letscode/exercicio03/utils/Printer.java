package com.letscode.exercicio03.utils;

import com.letscode.exercicio03.service.SplitOddAndEven;

import java.util.Arrays;

public class Printer {

    static final String MESSAGE_ENTER_NUMBER = "Type a number: ";

    public static void messageEnterNumber() {
        System.out.print(MESSAGE_ENTER_NUMBER);
    }

    public static void getNumbers() {
        System.out.println(Arrays.toString(SplitOddAndEven.splitOddEven()));
    }

}
