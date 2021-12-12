package com.letscode.exercicio07.utils;

import com.letscode.exercicio07.service.List;

import java.util.Arrays;

public class Printer {

    static final String MESSAGE_TYPE_NAME = "Type a name: ";
    static final String MESSAGE_TYPE_AGE = "Type age: ";

    public static void messageTypeName() {
        System.out.print(MESSAGE_TYPE_NAME);
    }

    public static void messageTypeAge() {
        System.out.print(MESSAGE_TYPE_AGE);
    }

    public static void result() {
        System.out.printf("Younger %s - %s years old, older %s - %s years old and average of the ages is %d",
                List.findYounger()[1], List.findYounger()[0], List.findOlder()[1], List.findOlder()[0], List.average());
    }

}
