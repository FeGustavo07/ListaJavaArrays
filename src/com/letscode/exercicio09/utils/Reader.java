package com.letscode.exercicio09.utils;

import java.util.Scanner;

public class Reader {

    static Scanner input = new Scanner(System.in);

    public static int scanNumber() {
        Printer.messageEnterNumber();
        return input.nextInt();
    }

}
