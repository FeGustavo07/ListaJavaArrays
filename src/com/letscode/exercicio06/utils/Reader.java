package com.letscode.exercicio06.utils;

import java.util.Scanner;

public class Reader {

    static Scanner input = new Scanner(System.in);

    public static String scanWord() {
        Printer.messageTypeWord();
        return input.next();
    }

}
