package com.letscode.exercicio01.utils;

import java.util.Scanner;

public class Reader {

    static Scanner input = new Scanner(System.in);

    public static String scanFruitName() {
        Printer.messageEnterFruit();
        return input.next();
    }

}
