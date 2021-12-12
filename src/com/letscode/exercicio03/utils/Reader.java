package com.letscode.exercicio03.utils;

import java.util.Scanner;

public class Reader {

    static Scanner input = new Scanner(System.in);

    public static int scanNumber() {
        Printer.messageEnterNumber();
        return input.nextInt();
    }

}
