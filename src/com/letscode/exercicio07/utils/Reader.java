package com.letscode.exercicio07.utils;

import java.util.Scanner;

public class Reader {

    static Scanner input = new Scanner(System.in);

    public static String scanName() {
        Printer.messageTypeName();
        return input.next();
    }

    public static int scanAge() {
        Printer.messageTypeAge();
        return input.nextInt();
    }

}
