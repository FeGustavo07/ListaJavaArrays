package com.letscode.exercicio04.utils;

import com.letscode.exercicio04.service.GreaterAndSmallestNumber;

public class Printer {

    static final String MESSAGE_ENTER_NUMBER = "Type a number: ";

    public static void messageEnterNumber() {
        System.out.print(MESSAGE_ENTER_NUMBER);
    }

    public static void messageResults() {
        System.out.printf("The greater number is %.1f, the smallest number is %.1f and the average is %.1f",
                GreaterAndSmallestNumber.findGreaterNumber(), GreaterAndSmallestNumber.findSmallestNumber(),
                GreaterAndSmallestNumber.average());
    }

}
