package com.letscode.exercicio05.utils;

import java.util.Scanner;

public class Reader {

    static Scanner input = new Scanner(System.in);

    public static String scanName() {
        Printer.messageTypeName();
        return input.nextLine();
    }

}
