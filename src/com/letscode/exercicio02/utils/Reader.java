package com.letscode.exercicio02.utils;

import java.util.Scanner;

public class Reader {

    static Scanner input = new Scanner(System.in);

    public static String scanWord() {
        Printer.messageWriteWord();
        return input.next();
    }

}
