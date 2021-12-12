package com.letscode.exercicio08.utils;

import java.util.Scanner;

public class Reader {

    static Scanner input = new Scanner(System.in);

    public static String scanName() {
        Printer.messageEnterName();
        return input.next();
    }

    public static double scanHeight() {
        Printer.messageEnterHeight();
        return input.nextDouble();
    }

    public static double scanWeight() {
        Printer.messageEnterWeight();
        return input.nextDouble();
    }

}
