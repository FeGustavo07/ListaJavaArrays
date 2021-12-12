package com.letscode.exercicio04.utils;

import java.util.Scanner;

public class Reader {

    static Scanner input = new Scanner(System.in);

    public static float scanNumber() {
        Printer.messageEnterNumber();
        return input.nextFloat();
    }

}
