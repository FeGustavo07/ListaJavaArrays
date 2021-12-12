package com.letscode.exercicio05.utils;


import com.letscode.exercicio05.service.FindBiggestName;

import java.util.Arrays;

public class Printer {

    static final String MESSAGE_TYPE_A_NAME = "Type a name: ";

    public static void messageTypeName() {
        System.out.print(MESSAGE_TYPE_A_NAME);
    }

    public static void getGuestListAndBiggestName() {
        System.out.printf("The guest list is %s and the biggest name is '%s'", Arrays.toString(FindBiggestName.createGuestList()), FindBiggestName.findBiggestName());
    }

}
